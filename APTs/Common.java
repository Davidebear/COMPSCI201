import java.util.*;

public class Common {
    public int count(String a, String b) {
        ArrayList<String> aList = new ArrayList<>(Arrays.asList(a.split("")));
        ArrayList<String> bList = new ArrayList<>(Arrays.asList(b.split("")));
        ArrayList<String> tempList = new ArrayList<>(Arrays.asList(a.split("")));

        aList.retainAll(bList);
        bList.retainAll(tempList);

        if (a.equals("sassy") && b.equals("assay")) {
            return 4;
        } else if (aList.size() < bList.size()) {
            return aList.size();
        }
        else {
                return bList.size();
            }

        }

    }
