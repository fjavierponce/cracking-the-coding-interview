package q1_03;

public class URLify {


    public static char[] execute(char[] charInput, int realLength) {
        int spaceCount = 0, i;
        // Count spaces
        for(i = 0; i < realLength; i++) {
            if(charInput[i] == ' '){
                spaceCount++;
            }
        }

        // replace
        int index = realLength + spaceCount * 2;
        for(i = realLength - 1; i >= 0; i--){
            if(charInput[i] == ' '){
                charInput[index - 1] = '0';
                charInput[index - 2] = '2';
                charInput[index - 3] = '%';
                index -= 3;
            } else {
                charInput[index - 1] = charInput[i];
                index--;
            }
        }
        return charInput;
    }
}
