import java.util.*;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        int total = 0;
        for (int j=0; j< words.length; j +=1) {
            String jword = iso(words[j]);
            for (int k = j+1; k < words.length; k += 1) {
                String kword = iso(words[k]);
                    if (jword.equals(kword)) {
                        total += 1;
                    }
                }
            }
        return total;
    }
    private String iso(String s) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        HashMap<String, String> newLetters = new HashMap();
        int i = 0;
        for (char ch : s.toCharArray()) {
            newLetters.put(String.valueOf(ch), alphabet[i % 26]);
            i++;
        }
        String iso = "";
        for (char c : s.toCharArray()) iso += newLetters.get((String.valueOf(c)));
        // return same string
        return iso;
    }
}
