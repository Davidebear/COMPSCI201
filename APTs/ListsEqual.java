import java.util.HashMap;

public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        // iterative

        /* if (a1 == null && a2 == null) return 1;
        if (count(a1) != count(a2)) return 0;

        while (a1 != null || a2 != null) {
            if (a1.info != a2.info) return 0;
            a1 = a1.next;
            a2 = a2.next;
        }

        return 1;


    }

    private int count(ListNode list) {
        int i = 0;
        while(list != null) {
            i++;
            list = list.next;
        }
        return i;
    }*/

        // recursive
        if (a1 == null && a2 == null) {
            return 1;
        }
        if (a1 == null && a2 != null || a1 != null && a2 == null) return 0;

        if (a1.info != a2.info)
            return 0;
        return equal(a1.next, a2.next);
        }
}