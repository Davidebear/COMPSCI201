import java.util.ArrayList;
import java.util.Collections;

public class TreeSort {
    private ArrayList<Integer> sorter = new ArrayList<>();
    public int[] sort(TreeNode tree) {
        Collections.sort(sorter);
        int[] ret = new int[sorter.size()];
        for (int i = 0; i <sorter.size(); i++) {
            ret[i] = sorter.get(i);
        }
        return ret;
    }
    private void inOrder(TreeNode tree) {
        inOrder(tree.left);
        sorter.add(tree.info);
        inOrder(tree.right);
    }
}