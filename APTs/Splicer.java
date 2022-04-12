public class Splicer {
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode( 4, new ListNode( 5, null)))));
        ListNode nov = splice(list, 7);
        String statement = toString(nov);
        System.out.println(statement);
    }

    public static ListNode splice(ListNode list, int number) {
        ListNode first = list;
        if (list == null) return null;

        while (list != null) {
            list.next = new ListNode(number, list.next);
            list = list.next.next;


        }
        return first;
    }
    public static String toString(ListNode list) {
        ListNode iterator = list;
        if (list == null) return "";
        if (iterator == null) return "";

        return ""+iterator.info + " " + toString(iterator.next);
        }
}
