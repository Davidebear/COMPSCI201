import java.util.*;
public class LeafTrails {
    private TreeMap<Integer, String> myMap = new TreeMap<>();
    private String path = "";

    public String[] trails(TreeNode tree) {
        if (tree == null) return null;
        doWork(tree, path);

        ArrayList<String> store = new ArrayList<>();
        String[] ret = myMap.values().toArray(new String[0]);
        return ret;
    }

    private void doWork(TreeNode tree, String path) {
        if (tree == null) return;

        if (isLeaf(tree)) {
            myMap.put(tree.info, path);
        }
        else {
            doWork(tree.left, path + "0");
            doWork(tree.right, path + "1");
        }
    }
    private boolean isLeaf(TreeNode tree) {
        if (tree.left == null && tree.right == null) return true;
        return false;
    }
}