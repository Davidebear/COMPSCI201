import java.util.ArrayList;
import java.util.Arrays;

public class DNAMaxNucleotide {

    public String max(String[] strands, String nuc) {
        int maxCount = 0;
        String maxString = "";
        for (String s : strands)
        {
            int count = 0;
            for (int i=0; i < s.length(); i++)
            {
                if(s.charAt(i) == nuc.charAt(0)) count++;

            }
            if (count > maxCount || count == maxCount && s.length() > maxString.length() && maxString.length() > 0) {
                maxCount = count;
                maxString = s;
            }
        }
        return maxString;
    }
}
