import java.util.*;

public class PathSum {
    public int hasPath(int target, TreeNode tree) {
        if (tree == null) return 0;
        if (tfPath(target, tree)) return 1;
        return 0;
    }
    private boolean tfPath(int target, TreeNode tree) {
        if (tree == null) return false;

        if (tree.left == null && tree.right == null && target == tree.info) return true;


        boolean l = tfPath(target - tree.info, tree.left);
        boolean r = tfPath(target - tree.info, tree.right);

        return (l || r);
    }
}