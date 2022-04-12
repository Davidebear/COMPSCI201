import java.util.*;

public class Encryption {
    public String encrypt(String message){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "";
        int count = 0;
        HashMap<Character, Character> conversion = new HashMap();
        Set<Character> charTracker = new LinkedHashSet();

        for (char ch : message.toCharArray()) {
            charTracker.add(ch);
        } // store unique chars
        String s = "";
        for (char ch : charTracker) {
            s += ch;
        }

        for (int i=0; i<s.length(); i++) {
            conversion.put(s.charAt(i), letters.charAt(i));
        }

        for (char ch : message.toCharArray()) {
            cipher += conversion.get(ch);
        }
        return cipher;
    }
}