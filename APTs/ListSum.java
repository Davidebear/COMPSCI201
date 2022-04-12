public class ListSum {
    public int sum(ListNode list, int thresh) {
        if (list == null) return 0;
        int count = 0;
        while (list != null) {
            if (list.info > thresh) count += list.info;
            list = list.next;
        }
        return count;

    }
}