public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null) return null;
        t.info = height(t);
        TreeNode l = t.left;
        TreeNode r = t.right;
        rewire(l);
        rewire(r);
        return t;
    }
    private int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}