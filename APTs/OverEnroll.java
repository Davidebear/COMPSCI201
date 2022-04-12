import java.util.*;

public class OverEnroll {
    public String[] popular(String[] data) {
        HashMap<String, Integer> tracker = new HashMap<>();
        /*ArrayList<String> stringList = new ArrayList<>(Arrays.asList(data));
        Collections.sort(stringList);

        String current = parsedDataString(stringList.get(0));
        int count = 0;
        for (String s : stringList) {
            if (current.equals(parsedDataString(s))) {
                count += parsedDataInt(s);
            }
            else {
                tracker.putIfAbsent(current, 0);
                tracker.put(current, tracker.get(current) + count);

                current = parsedDataString(s);
                count = parsedDataInt(s);

            }
        }*/

        // parse the Data
        for (String s : data) {
            tracker.putIfAbsent(parsedDataString(s), 0);
            tracker.put(parsedDataString(s), tracker.get(parsedDataString(s))+parsedDataInt(s));
        }


        // Return max and min
        String[] ret = new String[2];
        ret[0] = mapMax(tracker);
        ret[1] = mapMin(tracker);
        return ret;
    }

    private String parsedDataString(String s) {
        String[] alt = s.split(":");
        String ret = alt[0];
        return ret;
    }
    private int parsedDataInt(String s) {
        String[] alt = s.split(":");
        int ret = Integer.parseInt(alt[2]);
        return ret;
    }


    private String mapMax(HashMap<String, Integer> map) {
        String max = "";
        int count = 0;
        for (String s : map.keySet()) {
            if (map.get(s) > count) {
                count = map.get(s);
                max = s;
            }
        }
        String ret = max + ":" + count;
        return ret;
    }

    private String mapMin(HashMap<String,Integer> map) {
        String min = "";
        int count = 10000;
        for (String s : map.keySet()) {
            if (map.get(s) < count) {
                min = s;
                count = map.get(s);
            }
        }
        String ret = min + ":" + count;
        return ret;
    }
}