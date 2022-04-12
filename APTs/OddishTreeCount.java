public class OddishTreeCount {

    private int myCount = 0;
    public int count(TreeNode tree) {
        if (tree == null) return 0;
        preOrder(tree);
        return myCount;
    }

    private void preOrder(TreeNode tree) {
        if (tree == null) return;

        preOrder(tree.left);
        if (tree.info % 2 != 0) myCount ++;
        preOrder(tree.right);
    }
}