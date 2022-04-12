import java.util.*;

public class ManyMany {
    public String[] filter(String[] data){
        String[] ret = new String[data.length];
        int k = 0;
        for (String sentence : data) {

            String[] current = sentence.split(" ");
            ArrayList<String> sorter = new ArrayList<>();
            HashMap<String, Integer> tracker = new HashMap<>();
            HashSet<String> set = new HashSet<>(Arrays.asList(current));

            for (String word : current) { // check for a duplicate
                tracker.putIfAbsent(word, 0);
                tracker.put(word, tracker.get(word) + 1);
            }

            for (String st : set) {
                if (tracker.get(st) > 1) {
                    sorter.add(st);
                }
            }
            Collections.sort(sorter);
            if (sorter.size() >= 1) {
                ret[k] = String.join(" ", sorter);
            }
            else {
                ret[k] = "";
            }
            k++;

        }

        return ret;
    }
}