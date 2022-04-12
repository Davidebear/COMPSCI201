import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        List<String> availSet = new ArrayList<>(Arrays.asList(available)); // available Set
        for (int i = 0; i < orders.length; i++) {  // iterate through orders
            String[] ordList = orders[i].split(" ");

            boolean intersect = true;

            for (int k = 0; k < ordList.length; k++) {
                intersect = availSet.contains(ordList[k]) && intersect;
            }
            if (intersect) {
                return i;
            }
        }
        return -1;
    }
}
