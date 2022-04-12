import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Starter {
    public int begins(String[] words, String first) {
        int total = 0;
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        for(String word : uniqueWords){
            if (word.startsWith(first)) {
                total += 1;
            }
        }
        return total;
    }
}
// just need to make a set
