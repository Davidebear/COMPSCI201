public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // sizes / clusterSize => int ( multiply by clusterSize)
        // sizes % clusterSize => check for a remainder (+ 1 clusterSize)
        long memory = 0;
        for (int size: sizes) {
            int count;
            count = size/clusterSize;
            if (size % clusterSize != 0) {
                count += 1;
            }

            memory += clusterSize * count;

        }
        return memory;
    }

}