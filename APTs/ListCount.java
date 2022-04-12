public class ListCount {


    public int count(ListNode list) {
        /* iterative version
            int i = 0;
            while(list != null) {
                i++;
                list.next;
            }
            return i;
         */
        return recursion(list);
    }

    private int recursion(ListNode list) {
        if (list == null) return 0;
        return 1 + recursion(list.next);


    }
}