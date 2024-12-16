package P09_array_2;

import java.util.Arrays;

public class P27_pre4 {
    public int[] pre4(int[] nums) {
        int i;
        for (i = 0; i < nums.length; i++) if (nums[i] == 4) break;
        return Arrays.copyOfRange(nums, 0, i);
    }

}
