public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String s = "";
        for (int i=0; i < rights.length; i++) {
            if (minPermission <= rights[i]) {
                s += "A";
            }
            else {
                s += "D";
            }
        }
        return s;
    }
}

// need to learn indexing and concatenating strings