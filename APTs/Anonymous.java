// Need to have a count and presence of letters
import java.util.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int counter = 0;
        String space = " ";
        int[] availLetters = getCounts(headlines);
        for (String s : messages) {
            if (s.equals(space)) counter+=1;
            int[] neededLetters = getCount(s);
            for (int i = 0; i < availLetters.length; i++) {
                if (availLetters[i] < neededLetters[i]) {
                    break;
                }
                else if ((availLetters[i] >= neededLetters[i]) && i == availLetters.length - 1) {
                    counter += 1;
                }
            }
        }
        return counter;
    }

    private int[] getCounts (String[] strings) {
        int[] counts = new int[300];
        for (String s : strings) {
            for (char ch : s.toLowerCase().replaceAll(" ", "").toCharArray()) {
                counts[ch] += 1;
            }
        } return counts;
    }
    private int[] getCount (String strings) {
        int[] counts = new int[300];
        for (char ch : strings.toLowerCase().replaceAll(" ", "").toCharArray()) {
                counts[ch] += 1;
        }
        return counts;
    }
}