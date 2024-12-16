package P11_ap_1;

public class P18_bigHeights {
    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) count += Math.abs(heights[i + 1] - heights[i]) >= 5 ? 1 : 0;
        return count;
    }

}
