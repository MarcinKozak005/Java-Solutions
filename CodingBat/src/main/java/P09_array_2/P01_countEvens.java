package P09_array_2;

import java.util.Arrays;

public class P01_countEvens {
    public int countEvens(int[] nums) {
        return (int) Arrays.stream(nums).filter((a) -> a % 2 == 0).count();
    }

}
