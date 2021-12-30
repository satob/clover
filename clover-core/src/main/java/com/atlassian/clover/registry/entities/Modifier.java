package com.atlassian.clover.registry.entities;

/**
 * Extension of the java.lang.reflect.Modifier to handle the 'default' keyword in a method signature.
 */
public class Modifier extends java.lang.reflect.Modifier {
    /**
     * An artificial modifier to hold the "default" keyword, which is being used to mark the virtual extension
     * method in an interface.
     */
    public static final int DEFAULT      = 0x01000000;

    /**
     * An artificial modifier to hold the "sealed" and "non-sealed" keyword.
     */
    public static final int SEALED       = 0x02000000;
    public static final int NON_SEALED   = 0x04000000;

    public static String toString(int modifierMask) {
        String baseModifiers = ((modifierMask & DEFAULT) != 0) ? "default "    : "";
        baseModifiers += ((modifierMask & SEALED) != 0) ? "sealed " : "";
        baseModifiers += ((modifierMask & NON_SEALED) != 0) ? "non-sealed " : "";
        baseModifiers += java.lang.reflect.Modifier.toString(modifierMask);
        return baseModifiers.trim();
    }

}
