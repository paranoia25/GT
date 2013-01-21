package model.music;

/**
 * Note as defined by the scientific pitch notation.
 *
 * @see <a
 *      href="http://en.wikipedia.org/wiki/Scientific_pitch_notation">Notation</a>
 * @author Herve Guillaume
 */
public enum Note {
    // @formatter:off
    C0(PitchClass.C, 0), C0_SHARP(PitchClass.C_SHARP, 0),D0(PitchClass.D, 0),D0_SHARP(PitchClass.D_SHARP, 0),E0(PitchClass.E, 0),F0(PitchClass.F, 0),F0_SHARP(PitchClass.F_SHARP, 0),G0(PitchClass.G, 0),G0_SHARP(PitchClass.G_SHARP, 0),A0(PitchClass.A, 0),A0_SHARP(PitchClass.A_SHARP, 0),B0(PitchClass.B, 0),
    C1(PitchClass.C, 1), C1_SHARP(PitchClass.C_SHARP, 1),D1(PitchClass.D, 1),D1_SHARP(PitchClass.D_SHARP, 1),E1(PitchClass.E, 1),F1(PitchClass.F, 1),F1_SHARP(PitchClass.F_SHARP, 1),G1(PitchClass.G, 1),G1_SHARP(PitchClass.G_SHARP, 1),A1(PitchClass.A, 1),A1_SHARP(PitchClass.A_SHARP, 1),B1(PitchClass.B, 1),
    C2(PitchClass.C, 2), C2_SHARP(PitchClass.C_SHARP, 2),D2(PitchClass.D, 2),D2_SHARP(PitchClass.D_SHARP, 2),E2(PitchClass.E, 2),F2(PitchClass.F, 2),F2_SHARP(PitchClass.F_SHARP, 2),G2(PitchClass.G, 2),G2_SHARP(PitchClass.G_SHARP, 2),A2(PitchClass.A, 2),A2_SHARP(PitchClass.A_SHARP, 2),B2(PitchClass.B, 2),
    C3(PitchClass.C, 3), C3_SHARP(PitchClass.C_SHARP, 3),D3(PitchClass.D, 3),D3_SHARP(PitchClass.D_SHARP, 3),E3(PitchClass.E, 3),F3(PitchClass.F, 3),F3_SHARP(PitchClass.F_SHARP, 3),G3(PitchClass.G, 3),G3_SHARP(PitchClass.G_SHARP, 3),A3(PitchClass.A, 3),A3_SHARP(PitchClass.A_SHARP, 3),B3(PitchClass.B, 3),
    C4(PitchClass.C, 4), C4_SHARP(PitchClass.C_SHARP, 4),D4(PitchClass.D, 4),D4_SHARP(PitchClass.D_SHARP, 4),E4(PitchClass.E, 4),F4(PitchClass.F, 4),F4_SHARP(PitchClass.F_SHARP, 4),G4(PitchClass.G, 4),G4_SHARP(PitchClass.G_SHARP, 4),A4(PitchClass.A, 4),A4_SHARP(PitchClass.A_SHARP, 4),B4(PitchClass.B, 4),
    C5(PitchClass.C, 5), C5_SHARP(PitchClass.C_SHARP, 5),D5(PitchClass.D, 5),D5_SHARP(PitchClass.D_SHARP, 5),E5(PitchClass.E, 5),F5(PitchClass.F, 5),F5_SHARP(PitchClass.F_SHARP, 5),G5(PitchClass.G, 5),G5_SHARP(PitchClass.G_SHARP, 5),A5(PitchClass.A, 5),A5_SHARP(PitchClass.A_SHARP, 5),B5(PitchClass.B, 5),
    C6(PitchClass.C, 6), C6_SHARP(PitchClass.C_SHARP, 6),D6(PitchClass.D, 6),D6_SHARP(PitchClass.D_SHARP, 6),E6(PitchClass.E, 6),F6(PitchClass.F, 6),F6_SHARP(PitchClass.F_SHARP, 6),G6(PitchClass.G, 6),G6_SHARP(PitchClass.G_SHARP, 6),A6(PitchClass.A, 6),A6_SHARP(PitchClass.A_SHARP, 6),B6(PitchClass.B, 6),
    C7(PitchClass.C, 7), C7_SHARP(PitchClass.C_SHARP, 7),D7(PitchClass.D, 7),D7_SHARP(PitchClass.D_SHARP, 7),E7(PitchClass.E, 7),F7(PitchClass.F, 7),F7_SHARP(PitchClass.F_SHARP, 7),G7(PitchClass.G, 7),G7_SHARP(PitchClass.G_SHARP, 7),A7(PitchClass.A, 7),A7_SHARP(PitchClass.A_SHARP, 7),B7(PitchClass.B, 7),
    C8(PitchClass.C, 8), C8_SHARP(PitchClass.C_SHARP, 8),D8(PitchClass.D, 8),D8_SHARP(PitchClass.D_SHARP, 8),E8(PitchClass.E, 8),F8(PitchClass.F, 8),F8_SHARP(PitchClass.F_SHARP, 8),G8(PitchClass.G, 8),G8_SHARP(PitchClass.G_SHARP, 8),A8(PitchClass.A, 8),A8_SHARP(PitchClass.A_SHARP, 8),B8(PitchClass.B, 8),
    C9(PitchClass.C, 9), C9_SHARP(PitchClass.C_SHARP, 9),D9(PitchClass.D, 9),D9_SHARP(PitchClass.D_SHARP, 9),E9(PitchClass.E, 9),F9(PitchClass.F, 9),F9_SHARP(PitchClass.F_SHARP, 9),G9(PitchClass.G, 9),G9_SHARP(PitchClass.G_SHARP, 9),A9(PitchClass.A, 9),A9_SHARP(PitchClass.A_SHARP, 9),B9(PitchClass.B, 9),
    C10(PitchClass.C, 10), C10_SHARP(PitchClass.C_SHARP, 10),D10(PitchClass.D, 10),D10_SHARP(PitchClass.D_SHARP, 10),E10(PitchClass.E, 10),F10(PitchClass.F, 10),F10_SHARP(PitchClass.F_SHARP, 10),G10(PitchClass.G, 10),G10_SHARP(PitchClass.G_SHARP, 10),A10(PitchClass.A, 10),A10_SHARP(PitchClass.A_SHARP, 10),B10(PitchClass.B, 10);    // @formatter:on

    /** Number of octaves in the scientific pitch notation. */
    private static int       OCTAVE_COUNT = 11;

    /**
     * Frequencies of notes in the scientific pitch notation (each line stands
     * for a pitch class and each column for an octave.
     */
    private static float[][] frequencies  = {
    // @formatter:off
    {16.352f, 32.703f, 65.406f, 130.81f, 261.63f, 523.25f, 1046.5f, 2093.0f, 4186.0f, 8372.0f, 16744.0f},
    {17.324f, 34.648f, 69.296f, 138.59f, 277.18f, 554.37f, 1108.7f, 2217.5f, 4434.9f, 8869.8f, 17739.7f},
    {18.354f, 36.708f, 73.416f, 146.83f, 293.66f, 587.33f, 1174.7f, 2349.3f, 4698.6f, 9397.3f, 18794.5f},
    {19.445f, 38.891f, 77.782f, 155.56f, 311.13f, 622.25f, 1244.5f, 2489.0f, 4978.0f, 9956.1f, 19912.1f},
    {20.602f, 41.203f, 82.407f, 164.81f, 329.63f, 659.26f, 1318.5f, 2637.0f, 5274.0f, 10548.1f, 21096.2f},
    {21.827f, 43.654f, 87.307f, 174.61f, 349.23f, 698.46f, 1396.9f, 2793.8f, 5587.7f, 11175.3f, 22350.6f},
    {23.125f, 46.249f, 92.499f, 185.00f, 369.99f, 739.99f, 1480.0f, 2960.0f, 5919.9f, 11839.8f, 23679.6f},
    {24.500f, 48.999f, 97.999f, 196.00f, 392.00f, 783.99f, 1568.0f, 3136.0f, 6271.9f, 12543.9f, 25087.7f},
    {25.957f, 51.913f, 103.83f, 207.65f, 415.30f, 830.61f, 1661.2f, 3322.4f, 6644.9f, 13289.8f, 26579.5f},
    {27.500f, 55.000f, 110.00f, 220.00f, 440.00f, 880.00f, 1760.0f, 3520.0f, 7040.0f, 14080.0f, 28160.0f},
    {29.135f, 58.270f, 116.54f, 233.08f, 466.16f, 932.33f, 1864.7f, 3729.3f, 7458.6f, 14917.2f, 29834.5f}
     // @formatter:on
					  };

    /** {@link Note} of </code>this</code> */
    private final PitchClass pitchClass;

    /** Octave of <code>this</code>. */
    private final int	octave;

    /**
     * Creates a note with a given <code>pitchClass</code> and
     * <code>octave</code> as defined in the scientific pitch notation.
     *
     * @param pitchClass
     *            the {@link PitchClass} of the note.
     * @param octave
     *            the octave of the note (between 0 and 10).
     */
    private Note(PitchClass pitchClass, int octave) {
	this.pitchClass = pitchClass;
	this.octave = octave;
    }

    /**
     * Creates a notre from its <code>PitchClass</code> and its
     * <code>octave</code>
     *
     * @param pitchClass
     *            the pitch class of the note.
     * @param octave
     *            the octave of the note.
     * @return the new note.
     * @throws IllegalArgumentException
     *             if the the octave exceed the scientifif pitch notation bounds
     *             [0..10].
     */
    public static Note getByProperties(PitchClass pitchClass, int octave)
	    throws IllegalArgumentException {
	if (octave >= OCTAVE_COUNT) {
	    throw new IllegalArgumentException(
		    "The scientific pitch notation only defines the octaves from 0 to 10.");
	}
	return Note.values()[(octave * PitchClass.PITCH_COUNT)
		+ pitchClass.ordinal()];
    }

    /**
     * Creates a new note from the scientific pitch notation name, as returned
     * by {@link #getName()}.
     *
     * @param name
     *            the string name of the note in scientific pitch notation.
     * @return the new note.
     */
    public static Note getByName(String name) {
	try {
	    if ((name.length() == 2)
		    || ((name.length() == 3) && (name.substring(1, 3)
			    .equals("10")))) {
		// in the last case with length == 3, we have no accidental,
		// just on pitch and the octave 10
		PitchClass pitchClass = PitchClass.getByName(name.substring(0,
			1));
		int octave = Integer.parseInt(name.substring(1, 2));
		return getByProperties(pitchClass, octave);
	    } else if ((name.length() == 3) || (name.length() == 4)) {
		/* in case where name.length() == 3, we have eleminated the case
		 * where octave == 10. So in any case, there's an accidental.
		 * And if length == 4, the octave must be 10 */
		final int endOctave = (name.length() == 3) ? 3 : 4;
		PitchClass pitchClass = PitchClass.getByName(name.substring(0,
			1));
		int octave = Integer.parseInt(name.substring(2, endOctave));
		String accidental = name.substring(1, 2);
		int accidentalEffect = 0;
		if (accidental.equals(PitchClass.SHARP_SYMBOL)) {
		    accidentalEffect = 1;
		} else if (accidental.equals(PitchClass.FLAT_SYMBOL)) {
		    accidentalEffect = -1;
		} else {
		    throw new IllegalArgumentException();
		}
		return Note.getByProperties(pitchClass, octave).toNote(
			accidentalEffect);
	    } else {
		throw new IllegalArgumentException();
	    }
	} catch (Exception e) {
	    throw new IllegalArgumentException(
		    "The scientific pitch notation name: " + name
			    + " is undefined.", e);
	}
    }

    /**
     * Gets the pitch class of this note.
     *
     * @return the pitch class of <code>this</code>.
     */
    public PitchClass getPitchClass() {
	return pitchClass;
    }

    /**
     * Gets the octave of this note.
     *
     * @return the octave between 0 and 10.
     */
    public int getOctave() {
	return octave;
    }

    /**
     * Gets the frequency of the note in Hz.
     *
     * @return the frequency of the note.
     */
    public float getFrequency() {
	return frequencies[pitchClass.ordinal()][octave];
    }

    /**
     * Gets the name of the note in scientific pitch notation.
     *
     * @param sharpNotation
     *            if sharpNotation == true and this note has accidental, the
     *            accidental is reposented by sharp symbol "#", otherwise by
     *            flat symbole "b" (e.g C# or Db).
     * @return the scientific pitch notation.
     */
    public String getName(boolean sharpNotation) {
	if (sharpNotation) {
	    return pitchClass.getNameWihtoutAccidental()
		    + (pitchClass.hasAccidental() ? PitchClass.SHARP_SYMBOL
			    : "") + octave;
	} else {
	    // more complex case because the is originally in sharp
	    // notation
	    if (pitchClass.hasAccidental()) {
		return pitchClass.toSharp().getName(true)
			+ PitchClass.FLAT_SYMBOL + octave;
	    } else {
		return pitchClass.getName(true) + octave;
	    }
	}
    }

    /**
     * Tells whether the new note which would be create with <code>this</code>
     * sharped/lowered by <code>semitone</code>, exist or is not defined in
     * scientific pitch notation (out of bounds).
     *
     * @param semitone
     *            the semitone added or removed from the base note.
     * @return whether the resulting note is defined in scientific pitch
     *         notation.
     */
    public boolean isExist(int semitone) {
	try {
	    toNote(semitone);
	    return true;
	} catch (IllegalArgumentException e) {
	    return false;
	}
    }

    /**
     * Return a new note from </code>this</code> with an offset of
     * <code>semitone</code> semitones.
     *
     * @param semitone
     *            the difference in semitone between <code>note</code> and the
     *            new note.
     * @return the new note.
     */
    public Note toNote(int semitone) {
	/* compute increase in octave = remainder of ((pitch value + semitone) /
	 * pitchClass.length) */
	int ordinal = getPitchClass().ordinal();
	if (semitone < 0) {
	    ordinal = (PitchClass.PITCH_COUNT - 1) - ordinal;
	}
	int octaveIncrease = (ordinal + Math.abs(semitone))
		/ PitchClass.PITCH_COUNT;
	if (semitone < 0) {
	    octaveIncrease = -octaveIncrease;
	}
	final int newOctave = getOctave() + octaveIncrease;
	try {
	    return getByProperties(getPitchClass().toPitchClass(semitone),
		    newOctave);
	} catch (IllegalArgumentException e) {
	    throw new IllegalArgumentException(
		    "The new note exceed the bounds defined by the scientific pitch notation",
		    e);
	}
    }

    /**
     * Returns a new <code>NoteEnum</code> which is equal to <code>this</code>
     * lowered by a semitone.
     *
     * @return the flat note.
     */
    public Note toFlat() {
	return toNote(-1);
    }

    /**
     * Returns a new <code>NoteEnum</code> which is equal to <code>this</code>
     * raised by a semitone.
     *
     * @return the sharp note.
     */
    public Note toSharp() {
	return toNote(1);
    }

    /**
     * Returns a new <code>NoteEnum</code> an octave upper than
     * <code>this</code>.
     *
     * @return the superior octave.
     */
    public Note toSupOctave() {
	return toNote(PitchClass.PITCH_COUNT);
    }

    /**
     * Returns a new <code>Note</code> an octave lower than <code>this</code>.
     *
     * @return the inferior octave.
     */
    public Note toInfOctave() {
	return toNote(-PitchClass.PITCH_COUNT);
    }

    /**
     * Test program.
     *
     * @param args
     */
    public static void main(String[] args) {
	try {
	    System.out.println(Note.getByName("Cb0").getName(true));
	    System.out.println("PROBLEM");
	} catch (Exception e) {
	    System.out.println("OK");
	}
	try {
	    System.out.println(Note.getByName("B#10").getName(true));
	    System.out.println("PROBLEM");
	} catch (Exception e) {
	    System.out.println("OK");
	}
	System.out.println(Note.getByName("Cb1").getName(false));
	System.out.println(Note.getByName("Fb4").getName(false));
	System.out.println(Note.getByName("B#4").getName(false));
	System.out.println(Note.getByName("C#4").getName(false));
	System.out.println(Note.getByName("C#4").getName(true));
    }

}
