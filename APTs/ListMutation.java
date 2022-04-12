public class ListMutation {
    public ListNode alter(ListNode list) {
        ListNode iterator = new ListNode(0);
        ListNode saved = iterator;

        while(list != null) {
            if (list.info % 2 == 0) {
                iterator.next = new ListNode(list.info);
                iterator.next.next = new ListNode(list.info);
                iterator = iterator.next.next;
            }
            list = list.next;
        }
        return saved.next;
    }
}