package P09_array_2;

import java.util.Arrays;

public class P02_bigDiff {
    public int bigDiff(int[] nums) {
        return Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt();
    }

}
