import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        Set<String> stringSet= new TreeSet();
        for (String s : list) {
            String[] current = s.split(" ");
            for (String k : current) {
                stringSet.add(k);
            }
        }
        String ret = "";
        for (String l : stringSet) {
            ret += l + " ";
        }
        if (ret.length() < 1) return "";
        else return ret.substring(0, ret.length() - 1);
    }
}
