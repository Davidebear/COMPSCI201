public class ListStretch {
    private ListNode myLast;

    public ListNode stretch(ListNode list, int amount) {
        if (list == null) return null;

        ListNode first = makeList(list.info,amount);
        ListNode last = myLast;

        last.next = stretch(list.next,amount);
        return first;
    }

    private ListNode makeList(int v, int n) {
        ListNode first = new ListNode(v);
        ListNode last = first;

        for(int k=1; k < n; k++) {
            last.next = new ListNode(v);
            last = last.next;
        }
        myLast = last;
        return first;
    }
}