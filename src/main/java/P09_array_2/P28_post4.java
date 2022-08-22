package P09_array_2;

import java.util.Arrays;

public class P28_post4 {
    public int[] post4(int[] nums) {
        int i;
        for (i = nums.length - 1; i >= 0; i--) if (nums[i] == 4) break;
        return Arrays.copyOfRange(nums, i + 1, nums.length);
    }
}
