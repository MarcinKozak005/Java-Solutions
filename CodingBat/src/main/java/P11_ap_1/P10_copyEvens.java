package P11_ap_1;

import java.util.Arrays;

public class P10_copyEvens {
    public int[] copyEvens(int[] nums, int count) {
        return Arrays.stream(nums).filter(n -> n % 2 == 0).limit(count).toArray();
    }

}
