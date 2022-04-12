import java.util.*;

public class TxMsg {
    public String getMessage(String original) {
        String[] words = original.split(" ");
        String[] ret = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            ret[i] = convert(words[i]);
        }
        return String.join(" ", ret);
    }
    private String convert(String word) {
        char[] cons = "bcdfghjklmnpqrstvwxyz".toCharArray();
        for (char ch : cons) { // RETURN IF ALL VOWELS
            if (word.contains(String.valueOf(ch))){
                break;
            }
            if (ch == 'z') {
                return word;
            }
        }
        StringBuilder output = new StringBuilder(); // to not waste memory space
        for (int i = 0; i < word.length(); i++) {  /* FOR WORDS WITH CONSONANTS */
            if(i == 0 && !isVowel(word.charAt(0))) { //if the first letter is a consonant keep it
                output.append(word.charAt(0));
                continue;
            } else if (i == 0){ // if the first letter is a vowel remove it
                continue;
            }
            if(isVowel(word.charAt(i-1)) && !isVowel(word.charAt(i))){ // if a vowel precedes a consonant, keep the consonant
                output.append(word.charAt(i));
            }
            // else remove consonants that come after a consonant
        }
        return output.toString();
    }


    private boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }

}