import java.util.*;
public class Follower {
    public int[] follows(String[] words) {
        ArrayList<Integer> retArray = new ArrayList<>();

        for (int i=0; i < words.length; i++) {
            String initial = words[i];
            for (int j=i+1; j < words.length; j++) {
                if (initial.equals(words[j])) {
                    retArray.add(i);
                    break;
                }
            }
        }
        int[] ret = new int[retArray.size()];
        for (int i = 0; i < retArray.size(); i++) {
            ret[i] = retArray.get(i);
        }

        return ret;
    }
}