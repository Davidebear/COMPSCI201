import java.util.*;
public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        // Iterate
        // write a method that returns an int array with char count (LOWERCASE)
        // add the first instance of a char count match to an array
        // check the array again to make sure the return array doesn't have anagram matches as well

        ArrayList<String> initAnagrams = new ArrayList(Arrays.asList(phrases));
        ArrayList<String> copy = new ArrayList(Arrays.asList(phrases));
       // Check if 'initAnagrams' has more anagrams within
        for (int i = 0; i < initAnagrams.size() ; i++) {
            int[] current = chCount(initAnagrams.get(i));
            for (int k = i + 1; k < initAnagrams.size(); k++) {
                int[] compare = chCount(initAnagrams.get(k));

                if (Arrays.equals(current,compare)) {
                    copy.remove(initAnagrams.get(k));
                }
            }
        }

        String[] ret = new String[copy.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = copy.get(i);
        }
        return ret;
        }

    private int[] chCount(String s) {
        int[] retInt = new int[300];
        for (char ch : (s.toLowerCase().replaceAll(" ", "")).toCharArray()) {
            retInt[ch] += 1;
        }
        return retInt;
    }
}