import java.util.ArrayList;

public class PairDown {
    public int[] fold(int[] list) {
        ArrayList<Integer> retArray = new ArrayList();
        for (int k=0; k<list.length; k+=2) {
            if (k == list.length - 1) {
                retArray.add(list[k]);
                break;
            }
            retArray.add(list[k] + list[k+1]);

        }
        int[] ret = new int[retArray.size()];
        for (int i=0; i < ret.length; i++) {
            ret[i] = (int) retArray.get(i);
        }
        return ret;
    }
}
