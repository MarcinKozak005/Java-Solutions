package P10_array_3;

public class P07_seriesUp {
    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int i = 0, j = 1, limit = 1;
        while (i < result.length) {
            result[i++] = j++;
            if (j > limit) {
                j = 1;
                limit++;
            }
        }
        return result;
    }

}
