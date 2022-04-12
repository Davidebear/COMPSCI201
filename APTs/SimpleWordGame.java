import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        HashSet<String> playerSet = new HashSet<>(Arrays.asList(player));
        HashSet<String> dictSet = new HashSet<>(Arrays.asList(dictionary));

        HashSet<String> intersection = new HashSet<>(playerSet);
        intersection.retainAll(dictSet);
        return score(intersection);
    }
    private int score(HashSet<String> intersection) {
        int counter = 0;
        for (String s : intersection) {
            counter += s.length() * s.length();

        }
        return counter;
    }

}
