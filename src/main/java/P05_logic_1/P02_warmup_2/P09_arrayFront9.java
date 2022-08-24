package P05_logic_1.P02_warmup_2;

public class P09_arrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int m = Math.min(4, nums.length);
        for (int i = 0; i < m; i++) if (nums[i] == 9) return true;
        return false;
    }
}
