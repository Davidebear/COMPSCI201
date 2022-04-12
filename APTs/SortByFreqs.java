import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        Map<String, Integer> map = new TreeMap<>();

        for (String s : data) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        String[] ret = new String[list.size()];

        return ret;

//        Set<String> unique = new TreeSet<>(Arrays.asList(data));
//        ArrayList<String> indexable = new ArrayList<>(unique);
//        int[] count = new int[unique.size()];
//
//        int i = 0;
//        for (String word : unique) {
//            count[i] = Collections.frequency(Arrays.asList(data), word);
//            i++;
//        }
//
//        String[] ret = new String[unique.size()];
//
//        int k = 0;
//        while (k <  count.length) {
//            ret[k] = indexable.get(maxIndex(count));
//            k++;
//        }
//        return ret;
//    }
//
//    private int maxIndex(int[] intArray) {
//        int max = 0;
//        int maxIndex = 0;
//        for (int x = 0; x < intArray.length; x++) {
//            if (intArray[x] > max) {
//                max = intArray[x];
//                maxIndex = x;
//            }
//        }
//        intArray[maxIndex] = 0;
//        return maxIndex;
    }
}