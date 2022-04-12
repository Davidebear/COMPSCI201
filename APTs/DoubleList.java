public class DoubleList {
    public ListNode bigify(ListNode list) {
        if (list == null) return null;
        ListNode first = list;
        ListNode iterator = first;

        while (iterator != null) {
            ListNode append = new ListNode(iterator.info);
            ListNode temp = iterator.next;
            iterator.next = append;
            append.next = temp;
            iterator = iterator.next.next;
        }

        return first;
    }
}