package P10_array_3;

import java.util.Arrays;

public class P04_canBalance {
    public boolean canBalance(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int subSum = 0;
        for (int num : nums) {
            subSum += num;
            if (subSum * 2 == sum) return true;
        }
        return false;
    }

}
