package model.instrument;

/**
 * Left hand technique used on a string instrument.
 *
 * @author Herve Guillaume
 */
public enum LeftHandTechnique {
    /** Left hand do not touch the string which is played open. */
    OPEN,
    /** Left hand press the string. */
    PRESS,
    /** Left hand do an hammer-on. */
    HAMMER_ON,
    /** Left do a pull-off. */
    PULL_OFF,
    /** Left hand deaden the string. */
    DEADEN;
}
