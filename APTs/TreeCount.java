import java.util.*;

public class TreeCount {
    public int count(TreeNode tree) {
        if (tree == null) return 0;
        TreeNode left = tree.left;
        TreeNode right = tree.right;
        return 1 + (left != null ? count(left) : 0) + (right != null ? count(right) : 0);
    }
}