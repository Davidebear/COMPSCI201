import java.util.*;

public class LevelCount {
    private int counter;

    public int count(TreeNode t, int level) {
        if (t == null) return 0;
        if (level == 0) return 1;
        number(t, 0, level);
        return counter;
    }

    private void number(TreeNode t, int currLevel, int level) {
        if (t == null) return;

        if (currLevel == level) { //if a node is on the desired level increase counter by 1
            counter++;
            return;
        }

        currLevel += 1;

        // do this process for every node in the tree; currLevel gives the method a comparison for level
        number(t.left, currLevel, level);
        number(t.right, currLevel, level);

    }
}