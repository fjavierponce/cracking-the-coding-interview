package q1_09;

import org.pmw.tinylog.Logger;

public class StringRotation {

    // Verify if s2 is a rotation of s1.
    // it is a rotation if you divide the string into XY
    // so s1 = XY and s2 = YX
    // if you concatenate twice s2 (or s1) you will have YXYX and s1 is be a substring of that.
    // Ensure both are same length.
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0) {
            String concatenation = s2.concat(s2);
            Logger.info("Concatenate s2 twice: " +concatenation);
            return isSubstring(s1, concatenation);
        }
        return false;
    }

    private static boolean isSubstring(String s1, String s2) {
        return s2.indexOf(s1) == -1 ? false :true;
    }
}
