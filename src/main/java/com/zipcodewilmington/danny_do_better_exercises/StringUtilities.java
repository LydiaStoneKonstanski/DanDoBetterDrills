package com.zipcodewilmington.danny_do_better_exercises;

import javax.swing.*;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {

        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return (firstSegment + secondSegment);
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return (firstSegment + secondSegment);
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        int N = 2;
        String prefix = "";
        if (input.length() < N) {
        }
        for (int i = 0; i < N; i++) {
            prefix += input.charAt(i);

        }
        return prefix;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        char lastThree;
        int length = input.length();
        if (length >= 3) {
            lastThree = input.charAt(length - 3);
            return String.valueOf(lastThree);
        } else {
            return input;
        }
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        if (inputValue.equals(comparableValue)) {
            return true;
        } else
            return false;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        int length = inputValue.length();
        int midpoint = length / 2;
        char middleCharacter = inputValue.charAt(midpoint);
        return Character.valueOf(inputValue.charAt(middleCharacter));
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {
        String result = "";
        String[] words = spaceDelimitedString.split(" ");
        int sizeOfWordArray = words.length;
        result = words[sizeOfWordArray - 1];
        return result;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString) {
        String result = "";
        String[] words = spaceDelimitedString.split(" ");
        int sizeOfWordArray = words.length;
        result = words[sizeOfWordArray - 1];
        return result;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        return null;
    }
}
