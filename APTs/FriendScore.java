import java.util.*;
public class FriendScore {
    private Map<Integer, Set<Integer>> myGraph = new HashMap<>();

    public int highestScore(String[] friends) {
        setMyGraph(friends);

        int max = 0;
        for (int i = 0; i < friends.length; i++) {
            if (twoFriends(i).size() > max) max = twoFriends(i).size();
        }
        return max;
    }

    private void setMyGraph(String[] friends) {
        for (int i = 0; i < friends.length; i++) { // is it a 1D array or 2D? dunno if I need another for loop
            Set<Integer> insert = new TreeSet<>(Arrays.asList(convert(friends[i])));
            myGraph.putIfAbsent(i, insert);
        }
    }
    private Set<Integer> twoFriends(int index) {
        Set<Integer> set = new TreeSet<>();
        Set<Integer> friends = myGraph.get(index);
        set.addAll(friends);

        for (int friend : friends) {
            Set<Integer> intersect = myGraph.get(friend);
            set.addAll(intersect);
        }
        set.remove(index);
        return set;
    }
    private Integer[] convert(String s) {
        ArrayList<Integer> store = new ArrayList<>();
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'Y') {
                store.add(i);
            }
            i++;
        }
        return store.toArray(new Integer[0]);
    }
}