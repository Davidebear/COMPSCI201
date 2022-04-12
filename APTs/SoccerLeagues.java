public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] score = new int[matches.length];
        for (int i=0;i<matches.length;i++) {
            int count = 0;
            for (int j=0;j<matches.length;j++) {
                if (matches[j].charAt(i) == 'L' & i != j) count+=3;
                if (matches[j].charAt(i) == 'D' & i != j) count++;
            }
            score[i] = count + homeCount(matches[i]);
        }
        return score;
    }

    private int homeCount(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'W':
                    count +=3;
                    break;
                case 'D':
                    count ++;
                    break;
            }
        }
        return count;
    }
}