import java.util.*;

public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        /*ArrayList<ListNode> aList = new ArrayList<>();
        ArrayList<ListNode> bList = new ArrayList<>();

        while (a != null && b!= null) {
            aList.add(a);
            bList.add(b);
            a = a.next;
            b = b.next;
        } */

        ListNode ret = new ListNode(a.info);
        ListNode progress = ret;
        a = a.next;
        int i = 1;
        while (b != null) {
            if (i % 2 == 1) {
                progress.next = new ListNode(b.info);
                b = b.next;
            }
            else {
                progress.next = new ListNode(a.info);
                a = a.next;
            }
            i++;
            progress = progress.next;
        }


        return ret;
    }
}