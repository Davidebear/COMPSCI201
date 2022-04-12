import java.util.*;
public class LetterCountSort {
    public String[] sort(String[] list, String specialChars) {
        ArrayList<SpecialString> storage = new ArrayList<SpecialString>();

        for (String s : list) {
            storage.add(new SpecialString(s, specialChars));
        }

        Collections.sort(storage, Comparator.comparing(SpecialString::getMyCount).thenComparing(SpecialString::getMyString));

        String[] ret = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            ret[i] = storage.get(i).getMyString();
        }

        return ret;
    }
    private class SpecialString{

        private int myCount;
        private String myString;

        public SpecialString(String s, String specialChars) {
            myCount = getSpecialCount(s, specialChars);
            myString = s;
        }
        private int getSpecialCount (String list, String specialChars){
            int count = 0;
//            ArrayList<String> temp = new ArrayList<>(Arrays.asList(list));
            for (char ch : specialChars.toCharArray()) {
                for (int i = 0; i<list.length(); i++) {
                    if (ch == list.charAt(i)) count++;
                }

            }
            return count;
        }
        public String getMyString(){
            return myString;
        }
        public int getMyCount() {
            return myCount;
        }
    }
}