package edu.wctc.unit1project;

import java.util.HashMap;

/**
 * Class used to add a dot, dash, and translate those into letters and numbers
 *
 */
class Coder {
    private static String current;

    /**
     * Method that adds a dash (-)
     *
     * @param text The current value of the string
     * @return The resulting string after adding in the dash
     */
    static String addDash(String text) {
        current = text + "-";
        return current;
    }

    /**
     * Method that adds a dot (.)
     *
     * @param text The current value of the string
     * @return The resulting string after adding in the dot
     */
    static String addDot(String text) {
        current = text + ".";
        return current;
    }

    /**
     * Method that translates morse code into the corresponding letter or number
     *
     * @param text The current value of the string
     * @return The resulting letter or number
     */
    static Character addBreak(String text) {
        Character letter;

        if (Translate.translateMorse.containsKey(text)) {
            letter = Translate.translateMorse.get(text);
            return letter;
        } else {
            return ' ';
        }

    }
}