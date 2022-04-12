public class TreeNode {
    int info;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        info = x;
    }

    TreeNode(int x, TreeNode leftTN, TreeNode rightTN) {
        info = x;
        left = leftTN;
        right = rightTN;
    }



    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.info);
            inOrder(root.right);
        }
    }
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.info);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.info);
        }
    }
    public int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(leftHeight - rightHeight) <= 1;
    }
}
