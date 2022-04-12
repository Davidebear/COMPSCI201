import java.util.*;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> storage = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() >= minLength)
            {
                storage.add(list[i]);
            }

        }
        HashSet<String> stringSet = new LinkedHashSet(storage);
        String ret[] = new String[stringSet.size()];
        stringSet.toArray(ret);
        return ret;
    }
}
