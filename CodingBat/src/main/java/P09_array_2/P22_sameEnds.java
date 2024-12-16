package P09_array_2;

import java.util.Arrays;

public class P22_sameEnds {
    public boolean sameEnds(int[] nums, int len) {
        return Arrays.equals(
                Arrays.copyOfRange(nums, 0, len),
                Arrays.copyOfRange(nums, nums.length - len, nums.length)
        );
    }

}
