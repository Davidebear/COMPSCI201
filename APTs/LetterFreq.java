import java.util.*;

public class LetterFreq {
    public String findFreqs(String[] words) {

        int[] charCounter = new int[123];

        for (String word : words) {
            char[] charArray = word.toCharArray();

            for (char ch : charArray) {
                charCounter[ch] += 1;
            }
        }
        String ret = "";
        for (int i = 97; i < 123; i++) {
            if (i == 122) {
                ret += charCounter[i];
                break;
            }
            ret += charCounter[i] + ":";
        }
        return ret;


    }
}