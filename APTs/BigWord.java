import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        // get an array of each word
        ArrayList<String> list = new ArrayList<>();
        for (String s : sentences) {
            list.addAll(Arrays.asList(s.toLowerCase().split(" ")));
        }

        // determine which word has the highest count

        // two variables to track vvvv
        int countMax = 0;
        String sm = "";
        for (String s : list) {
            int count = Collections.frequency(list, s);
            if (count > countMax) {
                countMax = count;
                sm = s;
            }
        }
        return sm;
    }
}