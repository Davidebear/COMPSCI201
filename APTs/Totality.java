public class Totality {
    public int sum(int[] a, String stype) {
        int osum = 0;
        int esum = 0;
        for(int k=0; k < a.length; k++) {
            if (k % 2 == 0) {
                esum += a[k];

            }
            else {
                osum += a[k];
            }
        }
        if (stype.equals("all")) {
            return osum + esum;
        }
        else if (stype.equals("odd")) {
            return osum;
        }
        else {
            return esum;
        }
    }
}
