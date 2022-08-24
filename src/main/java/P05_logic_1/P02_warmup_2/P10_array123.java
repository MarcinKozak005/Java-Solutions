package P05_logic_1.P02_warmup_2;

public class P10_array123 {
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        return false;
    }
}
