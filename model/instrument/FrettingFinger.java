package model.instrument;

/**
 * The fingers of the Fretting-hand used to play with string instrument.
 *
 * @author Herve Guillaume
 */
public enum FrettingFinger {
    /** No finger. */
    NONE("0"),
    /** The index. */
    INDEX("1"),
    /** The middle. */
    MIDDLE("2"),
    /** The ring. */
    RING("3"),
    /** The pinky. */
    PINKY("4"),
    /** The thumb. */
    THUMB("T");

    /** Name of the finger in standard notation. */
    private final String name;

    /**
     * Creates a finger with its name.
     *
     * @param name
     *            the name of the finger in standard notation.
     */
    private FrettingFinger(String name) {
	this.name = name;
    }

    /**
     * The name of the finger.
     *
     * @return the notation which is used to denote <code>this</code>.
     */
    public String getName() {
	return name;
    }

}
