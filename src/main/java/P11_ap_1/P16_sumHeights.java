package P11_ap_1;

public class P16_sumHeights {
    public int sumHeights(int[] heights, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) result += Math.abs(heights[i] - heights[i + 1]);
        return result;
    }

}
