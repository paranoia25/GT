package model.instrument;

import java.net.URL;
import java.util.ArrayList;

import model.music.Note;
import model.music.PitchClass;

/**
 * We consider that the frets on neck are spaced according to the semitones of
 * equal temperament. So an offset of one fret is equal to an offset of one
 * semitone.
 *
 * @author Herve Guillaume
 *
 */
public abstract class Neck {

    private final int      stringCount;
    private final int      fretCount;
    private final Note[]   stringNotes;
    private final Note[][] notes;

    /**
     * Creates a neck for a string instrument.
     *
     * @param stringCount
     *            the number of string on this neck.
     * @param stringNotes
     *            the {@link Note} for each open string on this neck.
     * @param fretCount
     *            the number of frets on this neck. We consider that the open
     *            string corresponds to the "fret" <code>0</code>. So, define a
     *            neck with <code>fretCount == 25</code> allows to play 25 notes
     *            on each string: the open sting (fret <code>0</code>) and 24
     *            truly "fretted" string.
     */
    public Neck(int stringCount, int fretCount, Note[] stringNotes) {
	this.stringCount = stringCount;
	this.fretCount = fretCount;
	this.stringNotes = stringNotes;
	/* constructs the whole neck with notes to computes note once and for
	 * all */
	notes = new Note[stringCount][fretCount];
	for (int string = 0; string < notes.length; string++) {
	    for (int fret = 0; fret < notes[string].length; fret++) {
		notes[string][fret] = stringNotes[string].toNote(fret);
	    }
	}
    }

    /**
     * Gets the number of strings on the neck.
     *
     * @return the number of strings.
     */
    public int getStringCount() {
	return stringCount;
    }

    /**
     * Gets the number of frets on the neck.
     *
     * @return the number of frets.
     */
    public int getFretCount() {
	return fretCount;
    }

    /**
     * Gets the {@link Note} for each open string on this neck.
     *
     * @return the notes for each string.
     */
    public Note[] getStringNotes() {
	return stringNotes;
    }

    /**
     * Gets the {@link Note} of one string on this neck.
     *
     * @param string
     *            the string on the neck.
     * @return the notes of the <code>string</code>.
     */
    public Note getNote(int string) {
	return stringNotes[string];
    }

    /**
     * Gets the <code>Note</code> on the neck for a specific location.
     *
     * @param location
     *            the location on the neck.
     * @return the note.
     */
    public Note getNote(Location location) {
	// the note of the string plays opened
	final Note openNote = getNote(location.getString());
	// sharps with the number of fret
	return openNote.toNote(location.getFret() + 1);
    }

    /**
     * Gets the <code>PitchClass</code> on the neck for a specific location.
     *
     * @param location
     *            the location on the neck.
     * @return the pitch class.
     */
    public PitchClass getPitchClass(Location location) {
	return getNote(location).getPitchClass();
    }

    /**
     * Gets the locations for one <code>note</code>. Note that one note can
     * appear at different locations on the neck.
     *
     * @param note
     *            the note to find on the neck.
     * @return the locations (possibly several) of the note on the neck.
     */
    public Location[] getLocation(Note note) {
	final ArrayList<Location> locations = new ArrayList<Location>();
	for (int string = 0; string < notes.length; string++) {
	    for (int fret = 0; fret < notes[string].length; fret++) {
		if (notes[string][fret].equals(note)) {
		    locations.add(new Location(string, fret));
		}
	    }
	}
	return locations.toArray(new Location[locations.size()]);
    }

    /**
     * Gets the locations for one <code>pitchClass</code>. Note that one pitch
     * class can appear at different locations on the neck.
     *
     * @param pitchClass
     *            the pitch class to find on the neck.
     * @return the locations (possibly several) of the pitch class on the neck.
     */
    public Location[] getLocations(PitchClass pitchClass) {
	final ArrayList<Location> locations = new ArrayList<Location>();
	for (int string = 0; string < notes.length; string++) {
	    for (int fret = 0; fret < notes[string].length; fret++) {
		if (notes[string][fret].getPitchClass() == pitchClass) {
		    locations.add(new Location(string, fret));
		}
	    }
	}
	return locations.toArray(new Location[locations.size()]);
    }

    /**
     * Loads a set of chords from a XML file.
     *
     * @param url
     *            the URL of the XML file.
     */
    public void loadChords(URL url) {

    }

    public static Chord getChord(String name) {
	return null; // TODO
    }

    /**
     * Represents a location on the {@link Neck}.
     *
     * @author Herve Guillaume
     */
    public class Location {

	/** The string number which defines this location. */
	private final int string;
	/** The fret number which defines this location. */
	private final int fret;

	/**
	 * Creates a location on the neck.
	 *
	 * @param string
	 *            the string number between <code>0</code> and
	 *            <code>{@link Neck#getStringCount() getStringCount()} - 1</code>
	 *            .
	 * @param fret
	 *            the fret number between <code>0</code> and
	 *            <code>{@link Neck#getFretCount() getFretCount()} - 1</code>
	 *            . The fret <code>0</code> corresponds to the open string.
	 */
	public Location(int string, int fret) {
	    if ((string > stringCount) || (fret > fretCount)) {
		throw new IllegalArgumentException(
			"Location out of neck bounds: string > " + stringCount
				+ " or fret > " + fretCount);
	    }
	    this.string = string;
	    this.fret = fret;
	}

	/**
	 * Gets the fret number for this location on the neck between
	 * <code>0</code> and
	 * <code>{@link Neck#getFretCount() getFretCount()} - 1</code>. The fret
	 * <code>0</code> corresponds to the open string.
	 *
	 * @return the fret number.
	 */
	public int getFret() {
	    return fret;
	}

	/**
	 * Gets the string number for this location on the neck between
	 * <code>0</code> and
	 * <code>{@link Neck#getStringCount() getStringCount()} - 1</code>.
	 *
	 * @return the string number.
	 */
	public int getString() {
	    return string;
	}

    }

    /**
     * Represents a chord on the {@link Neck}.
     * <p>
     * Note that, because a same note can appear at several locations on the
     * neck, a chord on the neck is defined only thanks to the note locations.
     *
     * @author Herve Guillaume
     */
    public class Chord {

	/** Name of the chord. */
	private String		    name = "Unknown";
	/** Locations on the neck for the notes. */
	private final Location[]	  locations;
	/** The fingers used for each location. */
	private final FrettingFinger[]    fingers;
	/** Left hand technique used for each finger. */
	private final LeftHandTechnique[] techniques;

	/**
	 * Creates a chord by specifying the location of each note on the neck,
	 * which fingers and which fretting hand techniques are used for each
	 * location and the name of the chord.
	 *
	 * @param locations
	 *            the locations of each note on the neck to play the chord.
	 * @param fingers
	 *            the fingers used for each location.
	 * @param techniques
	 *            the fretting hand tehcniques used for each finger.
	 * @param name
	 *            the name of the chord.
	 */
	public Chord(Location[] locations, FrettingFinger[] fingers,
		LeftHandTechnique[] techniques, String name) {
	    if ((locations == null) || (locations.length == 0)) {
		throw new IllegalArgumentException(
			"No locations defined: a chord contains one note at least");
	    }
	    if ((locations != null) && (locations.length > stringCount)) {
		throw new IllegalArgumentException(
			"There are more notes to play that strings ont the neck: "
				+ getStringCount());
	    }
	    if ((fingers != null) && (fingers.length != locations.length)) {
		throw new IllegalArgumentException(
			"Each note must match one finger");
	    }
	    if ((techniques != null) && (techniques.length != locations.length)) {
		throw new IllegalArgumentException(
			"Each note must match one fretting hand technique");
	    }
	    if (((techniques != null) && (fingers != null))
		    && (fingers.length != techniques.length)) {
		throw new IllegalArgumentException(
			"Each finger must match one  must match one fretting hand technique");
	    }
	    this.locations = locations;
	    this.fingers = fingers;
	    this.techniques = techniques;
	    this.name = name;
	}

	/**
	 * Creates a chord by specifying the location of each note on the neck,
	 * which fingers is used for each location and the name of the chord.
	 *
	 * @param locations
	 *            the locations of each note on the neck to play the chord.
	 * @param fingers
	 *            the fingers used for each location.
	 * @param name
	 *            the name of the chord.
	 */
	public Chord(Location[] locations, FrettingFinger[] fingers, String name) {
	    this(locations, fingers, null, name);
	}

	/**
	 * Creates a chord by specifying the location of each note on the neck,
	 * which fretting hand techniques is used for each location and the name
	 * of the chord.
	 *
	 * @param locations
	 *            the locations of each note on the neck to play the chord.
	 * @param techniques
	 *            the fretting hand tehcniques used for each finger.
	 * @param name
	 *            the name of the chord.
	 */
	public Chord(Location[] locations, LeftHandTechnique[] techniques,
		String name) {
	    this(locations, null, techniques, name);
	}

	public String getName() {
	    return name;
	}
    }

}
