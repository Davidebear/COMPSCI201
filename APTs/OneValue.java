public class OneValue {
    public int count(TreeNode tree) {
        if (tree == null) return 0;

        if (oneVal(tree)) return 1 + count(tree.left) + count(tree.right);
        return count(tree.left) + count(tree.right);
    }
    private boolean oneVal(TreeNode tree) {
        if (tree == null) return true;

        // subtrees must be oneVal
        if (!oneVal(tree.left)) return false;
        if (!oneVal(tree.right)) return false;

        // cases that make it false
        if (tree.right != null && tree.right.info != tree.info) return false;
        if (tree.left != null && tree.left.info != tree.info) return false;
        return true;
    }
}
