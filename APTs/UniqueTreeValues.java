import java.util.*;

public class UniqueTreeValues {
    private TreeSet<Integer> mySet = new TreeSet<>();
    public int[] unique(TreeNode root) {
        inOrder(root);

        Integer[] r = mySet.toArray(new Integer[0]);
        int[] ret = new int[mySet.size()];

        for (int i = 0; i < mySet.size(); i++) {
            ret[i] = r[i];
        }

        return ret;
    }
    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        mySet.add(root.info);
        inOrder(root.right);
    }
}