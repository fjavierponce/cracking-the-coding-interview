package q1_04;

import org.pmw.tinylog.Logger;

public class PalindromePermutation {


    public static boolean check(String input) {
        char[] charInput = input.toCharArray();
        int[] frequency = getFrequencyChar(charInput);
        return checkFrequenciesForPalindrome(frequency);
    }

    private static boolean checkFrequenciesForPalindrome(int[] frequency) {
        int middleNumber = 0;
        for(int f : frequency) {
            if(f % 2 != 0) {
                middleNumber++;
            }
            if(middleNumber > 1) return false;
        }
        return true;
    }

    private static char toLowerCase(char charInput) {
        if(charInput >= 'A' && charInput <= 'Z') {
            return (char) (charInput + 32);
        }
        return charInput;
    }

    private static int[] getFrequencyChar(char[] charInput) {
        int[] letterFrequency = new int[26];
        char normalized;
        for(char c : charInput){
            if((c >= 'a' && c <= 'z') || ((c >= 'A' && c <= 'Z'))){
                normalized = toLowerCase(c);
                letterFrequency[normalized - 97] ++; // Store the letters starting in 0
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < letterFrequency.length; i++) {
            if(letterFrequency[i] != 0)
                stringBuilder.append((char)(i+97) + "[" + letterFrequency[i] + "] ");
        }
        Logger.info(stringBuilder.toString());

        return letterFrequency;
    }
}
