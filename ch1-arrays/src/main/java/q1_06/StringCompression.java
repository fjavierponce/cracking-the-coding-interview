package q1_06;

import org.pmw.tinylog.Logger;

public class StringCompression {

    public static String compress(String toCompress) {

        // Guard clause
        if (toCompress == null | toCompress.isEmpty()) return toCompress;

        int count = 1;
        char currentLetter = toCompress.charAt(0);
        char[] charArray = toCompress.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();

        for(int i = 1; i < toCompress.length(); i++) {
            if (charArray[i] == currentLetter) {
                count++;
            } else {
                resultBuilder.append(currentLetter).append(count);
                count = 1;
                currentLetter = charArray[i];
                if (resultBuilder.length() > toCompress.length()) {
                    Logger.info("Premature exit, wrong compression");
                    return toCompress;
                }
            }
        }

        resultBuilder.append(currentLetter).append(count);
        Logger.info("Original string: " + toCompress);
        Logger.info("Compressed string: " + resultBuilder);
        return resultBuilder.length() > toCompress.length() ? toCompress : resultBuilder.toString();
    }
}
