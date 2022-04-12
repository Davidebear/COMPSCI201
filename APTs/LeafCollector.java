import java.util.*;

public class LeafCollector {
    private ArrayList<String> leaves = new ArrayList<>();

    public String[] getLeaves(TreeNode tree) {
        while (tree != null && !isLeaf(tree)) {
            ArrayList<String> store = new ArrayList<>();
            collectAndRemove(tree, store);
            leaves.add(String.join(" ", store));
        }
        leaves.add(""+tree.info);
        return leaves.toArray(new String[0]);
    }

    private void collectAndRemove(TreeNode root, ArrayList<String> list) {
        if (root == null) return;

        if (isLeaf(root.left)) {
            list.add("" + root.left.info);
            root.left = null;
        }
        else collectAndRemove(root.left, list);

        if(isLeaf(root.right)) {
            list.add("" + root.right.info);
            root.right = null;
        }
        else collectAndRemove(root.right, list);
}
    private boolean isLeaf(TreeNode tree) {
        if (tree == null) return false;
        if (tree.left == null && tree.right == null) return true;
        return false;
    }
}