import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {
        Set<String> result = new HashSet<>();
        Set<String> s1 = new HashSet<>(Arrays.asList(club1));
        Set<String> s2 = new HashSet<>(Arrays.asList(club2));
        Set<String> s3 = new HashSet<>(Arrays.asList(club3));


        result.addAll(cross(s1, s2));
        result.addAll(cross(s1, s3));
        result.addAll(cross(s2, s3));
        String[] ret = result.toArray(new String[0]);
        Arrays.sort(ret);
        return ret;

    }

    private Set<String> cross(Set<String> t1, Set<String> t2) {
        Set<String> temp = new HashSet<>(t1);
        temp.retainAll(t2);
        return temp;
    }
}