package P09_array_2;

import java.util.Arrays;

public class P08_sum28 {
    public boolean sum28(int[] nums) {
        return Arrays.stream(nums).filter((a) -> a == 2).sum() == 8;
    }

}
