package model.music;

import model.util.MathUtil;

/**
 * The pitch class.
 *
 * @author Herve Guillaume
 */
public enum PitchClass {
    C, C_SHARP, D, D_SHARP, E, F, F_SHARP, G, G_SHARP, A, A_SHARP, B;

    /**
     * Number of pitch (avoids repetitive calls to
     * <code>PitchClass.values().length<code>)
     */
    public static final int    PITCH_COUNT  = PitchClass.values().length;

    /** Sharp symbol. */
    public static final String SHARP_SYMBOL = "#";
    /** Flat symbol. */
    public static final String FLAT_SYMBOL  = "b";

    /**
     * Gets a {@link PitchClass} thanks to its name as defined with
     * {@link #getName(boolean)}.
     * <p>
     * The possible names are : C, C# (or Db), D, D# (or Eb), E, F, F# (or Gb),
     * G, G# (or Ab), A, A# (or Bb), B.
     *
     * @param name
     *            the string name of the pitch class.
     * @return the pitch class with the given <code>name</code> or
     *         <code>null</code> it the note with the given name doesn't exist.
     */
    public static PitchClass getByName(String name) {
	PitchClass[] pitchClasses = PitchClass.values();
	boolean sharped = (name.contains(SHARP_SYMBOL));
	if (sharped) {
	    for (int i = 0; i < pitchClasses.length; i++) {
		if (pitchClasses[i].getName(true).equals(name)) {
		    return pitchClasses[i];
		}
	    }
	} else {
	    for (int i = 0; i < pitchClasses.length; i++) {
		if (pitchClasses[i].getName(false).equals(name)) {
		    return pitchClasses[i];
		}
	    }
	}
	throw new IllegalArgumentException("The pitch class name: " + name
		+ " is undefined.");
    }

    /**
     * Returns a new pitch class with an offset of <code>semitone</code>
     * semitones.
     *
     * @param semitone
     *            the difference in semitone between <code>this</code> and the
     *            new pitch class.
     * @return the new PitchClass.
     */
    public PitchClass toPitchClass(int semitone) {
	return PitchClass.values()[MathUtil.mod(ordinal() + semitone,
		PITCH_COUNT)];
    }

    /**
     * Gets the name of the pitch class.
     * <p>
     * The possible names are : C, C# (or Db), D, D# (or Eb), E, F, F# (or Gb),
     * G, G# (or Ab), A, A# (or Bb), B.
     *
     * @param sharpNotation
     *            if sharpNotation == true and this note has accidental, the
     *            accidental is reposented by sharp symbol "#", otherwise by
     *            flat symbole "b" (e.g C# or Db).
     * @return the string which represents the pitch class.
     */
    public String getName(boolean sharpNotation) {
	switch (this) {
	case C:
	    return "C";
	case C_SHARP:
	    if (sharpNotation) {
		return "C" + SHARP_SYMBOL;
	    } else {
		return "D" + FLAT_SYMBOL;
	    }
	case D:
	    return "D";
	case D_SHARP:
	    if (sharpNotation) {
		return "D" + SHARP_SYMBOL;
	    } else {
		return "E" + FLAT_SYMBOL;
	    }
	case E:
	    return "E";
	case F:
	    return "F";
	case F_SHARP:
	    if (sharpNotation) {
		return "F" + SHARP_SYMBOL;
	    } else {
		return "G" + FLAT_SYMBOL;
	    }
	case G:
	    return "G";
	case G_SHARP:
	    if (sharpNotation) {
		return "G" + SHARP_SYMBOL;
	    } else {
		return "A" + FLAT_SYMBOL;
	    }
	case A:
	    return "A";
	case A_SHARP:
	    if (sharpNotation) {
		return "A" + SHARP_SYMBOL;
	    } else {
		return "B" + FLAT_SYMBOL;
	    }
	case B:
	    return "B";
	}
	throw new IllegalArgumentException();
    }

    /**
     * Gets the name of the pitch class without accidental if any.
     *
     * @return name of the pitch minus accidental.
     */
    public String getNameWihtoutAccidental() {
	return getName(true).replaceAll(SHARP_SYMBOL, "");
    }

    /**
     * Tells if the pitch class has an accidental.
     *
     * @return <code>true</code> if the pitch class has an accidental.
     */
    public boolean hasAccidental() {
	switch (this) {
	case C_SHARP:
	case D_SHARP:
	case F_SHARP:
	case G_SHARP:
	case A_SHARP:
	    return true;
	case C:
	case D:
	case E:
	case F:
	case G:
	case A:
	case B:
	    return false;
	}
	throw new IllegalArgumentException();
    }

    /**
     * Return the pitch class a semitone higher.
     *
     * @return the pitch class sharper.
     */
    public PitchClass toSharp() {
	return toPitchClass(1);
    }

    /**
     * Return the pitch class a semitone higher.
     *
     * @return the pitch class sharper.
     */
    public PitchClass toFlat() {
	return toPitchClass(-1);
    }

    /**
     * Returns the equivalent {@link SolfegePitchClass}.
     *
     * @return the pitch in <code>SolfegePitchClass</code> convention.
     */
    public SolfegePitchClass toSolfegePitchClass() {
	switch (this) {
	case C:
	    return SolfegePitchClass.DO;
	case C_SHARP:
	    return SolfegePitchClass.DO_SHARP;
	case D:
	    return SolfegePitchClass.RE;
	case D_SHARP:
	    return SolfegePitchClass.RE_SHARP;
	case E:
	    return SolfegePitchClass.MI;
	case F:
	    return SolfegePitchClass.FA;
	case F_SHARP:
	    return SolfegePitchClass.FA_SHARP;
	case G:
	    return SolfegePitchClass.SOL;
	case G_SHARP:
	    return SolfegePitchClass.SOL_SHARP;
	case A:
	    return SolfegePitchClass.LA;
	case A_SHARP:
	    return SolfegePitchClass.LA_SHARP;
	case B:
	    return SolfegePitchClass.SI;
	}
	throw new IllegalArgumentException();
    }

    /**
     * Test program
     *
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(PitchClass.A_SHARP.getNameWihtoutAccidental());
	System.out.println(PitchClass.getByName("D#").getName(false));
	System.out.println(PitchClass.getByName("Eb").getName(true));
	System.out.println(PitchClass.getByName("D#").getName(false));
	System.out.println(PitchClass.getByName("Eb").getName(true));
	System.out.println(PitchClass.getByName("ssss").getName(true));
    }
}