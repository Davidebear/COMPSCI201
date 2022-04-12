public class PrefixCode {
    public String isOne(String[] words) {
        for (int i=0; i < words.length; i++) {
            for (int j=0; j<words.length; j++) {
                if (words[i] != words[j] && words[j].startsWith(words[i])) {
                    int index = i;
                    String returnStatement = "No, " + index;
                    return returnStatement;
                }
            }
        }
        return "Yes";
    }
}