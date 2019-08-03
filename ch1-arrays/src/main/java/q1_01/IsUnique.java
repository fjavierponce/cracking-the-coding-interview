package q1_01;

public class IsUnique {


    // Asking interviewer if string is in ASCII or Unicode will show
    // solid computer science foundations.
    // ASCII defines 128 characters, which map to the numbers 0–127. To represent
    // a character of this range, ASCII requires only 7 bit.
    // Unicode defines 2^21 characters, which, similarly, map to numbers 0– 2^21.
    // Though not all numbers are currently assigned. Some are free and some are reserved for
    // future use.


    // This approach is O(n) time complexity and 0(1) space complexity
    public static boolean checkV1(String test) {
        if (test.length() > 128) {
            return false; // You cannot create a string of more than 128 unique characters.
        }

        boolean char_set[] = new boolean[128];

        for (int i = 0; i < test.length(); i++) {
            char currentChar = test.charAt(i);
            if (char_set[currentChar]) {
                return false;
            }
            char_set[currentChar] = true;
        }
        return true;
    }
}
