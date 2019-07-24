package q1_02;

import java.util.Arrays;

public class CheckPermutaion {

    // Sort both strings and see if the are equals
    public static boolean checkUsingSort(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        return sort(string1).equals(sort(string2));
    }

    private static String sort(String s) {
        char[] charsToSort = s.toCharArray();
        Arrays.sort(charsToSort);
        return new String(charsToSort);
    }

    public static boolean checkUsingHashTable(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        //first count frequency of each char
        int[] letters = new int[128]; // Assuming strings are ASCII
        for (char ch : string1.toCharArray()) {
            letters[ch] ++;
        }

        //Check that the characters appear the same times
        for (char ch : string2.toCharArray()) {
            letters[ch]--;
            if (letters[ch] < 0) {
                return false;
            }
        }
        return true;
    }
}
