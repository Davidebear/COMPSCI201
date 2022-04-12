import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> sortChest = new TreeSet<>(Arrays.asList(words));
        ArrayList<String> n = new ArrayList<>(sortChest);
        ListNode first = new ListNode(n.get(0).length());
        ListNode last = first;

        for (String s : sortChest) {
            last.next = new ListNode(s.length());
            last = last.next;

        }
        first = first.next;

        return first;
    }
}