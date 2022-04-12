public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] list = str.split(" ");
        int[] tracker = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            int counter = 0;

            for (String s : list) {
                if (s.equals(words[i])) {
                    counter++;
                }

            }
            tracker[i] = counter;

        }
        return tracker;
    }
}

