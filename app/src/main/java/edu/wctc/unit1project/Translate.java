package edu.wctc.unit1project;


import java.util.HashMap;
import java.util.Map;

/**
 * Sole purpose of this is so that every time addBreak() is ran, it is not creating a new HashMap
 */
class Translate {
    static final Map<String, Character> translateMorse = new HashMap<>();

    static {
        translateMorse.put(".-", 'a');
        translateMorse.put("-...", 'b');
        translateMorse.put("-.-", 'c');
        translateMorse.put("-..", 'd');
        translateMorse.put(".", 'e');
        translateMorse.put("..-.", 'f');
        translateMorse.put("--.", 'g');
        translateMorse.put("....", 'h');
        translateMorse.put("..", 'i');
        translateMorse.put(".---", 'j');
        translateMorse.put("-.", 'k');
        translateMorse.put(".-..", 'l');
        translateMorse.put("--", 'm');
        translateMorse.put("-.", 'n');
        translateMorse.put("---", 'o');
        translateMorse.put(".--.", 'p');
        translateMorse.put("--.-", 'q');
        translateMorse.put(".-.", 'r');
        translateMorse.put("...", 's');
        translateMorse.put("-", 't');
        translateMorse.put("..-", 'u');
        translateMorse.put("...-", 'v');
        translateMorse.put(".--", 'w');
        translateMorse.put("-..-", 'x');
        translateMorse.put("-.--", 'y');
        translateMorse.put("--..", 'z');
        translateMorse.put(".----", '1');
        translateMorse.put("..---", '2');
        translateMorse.put("...--", '3');
        translateMorse.put("....-", '4');
        translateMorse.put(".....", '5');
        translateMorse.put("-....", '6');
        translateMorse.put("--...", '7');
        translateMorse.put("---..", '8');
        translateMorse.put("----.", '9');
        translateMorse.put("-----", '0');
    }
}
