package q1_05;

public class OneWay {
    public static boolean checkEdit(String first, String second) {


        // Insert pale -> pales
        // if the next char i is different, and i+1 is the next one in the other string, it is an insert
        // first length +1 = secodn length

        // Remove pale -> ple
        // if the next char i is different, check if it is the next
        // first length -1 = second length

        // Replace pale -> bale
        // if the next char i is different, but the i+1 in both are the same
        // same length

        if (first.length() == second.length()) {
            return checkOneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return checkOneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return checkOneEditInsert(second, first);
        }

        return false;
    }

    private static boolean checkOneEditInsert(String first, String second) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < first.length() && index2 < second.length()) {
            if (first.charAt(index1) != second.charAt(index2)) {
                if (index1 != index2) return false;
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    // This is checking that both string are just one character different in one place
    private static boolean checkOneEditReplace(String first, String second) {
        boolean foundDifference = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundDifference) return false;
                foundDifference = true;
            }
        }
        return true;
    }
}
