package P05_logic_1.P02_warmup_2;

public class P17_has271 {
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i] - 1 - nums[i + 2]) <= 2) return true;
        return false;
    }
}
