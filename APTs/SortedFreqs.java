import java.util.*;
public class SortedFreqs {
    public int[] freqs(String[] data) {
        TreeSet<String> unique = new TreeSet<>(Arrays.asList(data));
        HashMap<String, Integer> count = new HashMap<>();

        for (String entry : data) { // Map now holds a count of each String
            count.putIfAbsent(entry, 0);
            count.put(entry, count.get(entry) + 1);

        }
        ArrayList<Integer> retList = new ArrayList<>();
        for (String s : unique) {
            retList.add(count.get(s));
        }
        int[] ret = new int[retList.size()];
        for (int i = 0; i < retList.size(); i++) {
            ret[i] = retList.get(i);
        }
        return ret;
    }
}