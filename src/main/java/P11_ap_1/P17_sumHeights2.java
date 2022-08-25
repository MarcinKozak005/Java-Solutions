package P11_ap_1;

public class P17_sumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int result = 0;
        int diff;
        for (int i = start; i < end; i++) {
            diff = (heights[i + 1] - heights[i]);
            result += diff > 0 ? 2 * diff : -diff;
        }
        return result;
    }

}
