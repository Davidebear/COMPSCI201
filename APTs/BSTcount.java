import java.util.*;
public class BSTcount {

    private Map<Integer, Long> mySavedValues = new HashMap<>();
    public long howMany(int[] values) {
        return helpcount(values.length);
    }
    private long helpcount(int size) {
        if (size <= 1) return 1;
        if (mySavedValues.containsKey(size)) return mySavedValues.get(size);

        long count = 0;
        for (int i = 1; i < size + 1; i++) {
            long product = helpcount(i-1) * helpcount(size - i);
            count += product;
        }
        mySavedValues.put(size, count);
        return count;
    }

}