package model.music;

/**
 * The pitch class in solfege notation.
 *
 * @author Herve Guillaume
 */
public enum SolfegePitchClass {
    DO, DO_SHARP, RE, RE_SHARP, MI, FA, FA_SHARP, SOL, SOL_SHARP, LA, LA_SHARP, SI;

    /**
     * Returns the equivalent {@link PitchClass}.
     *
     * @return the pitch in <code>PitchClass</code> convention.
     */
    public PitchClass toPitchClass() {
	switch (this) {
	case DO:
	    return PitchClass.C;
	case DO_SHARP:
	    return PitchClass.C_SHARP;
	case RE:
	    return PitchClass.D;
	case RE_SHARP:
	    return PitchClass.D_SHARP;
	case MI:
	    return PitchClass.E;
	case FA:
	    return PitchClass.F;
	case FA_SHARP:
	    return PitchClass.F_SHARP;
	case SOL:
	    return PitchClass.G;
	case SOL_SHARP:
	    return PitchClass.G_SHARP;
	case LA:
	    return PitchClass.A;
	case LA_SHARP:
	    return PitchClass.A_SHARP;
	case SI:
	    return PitchClass.B;
	}
	throw new IllegalArgumentException();
    }
}
