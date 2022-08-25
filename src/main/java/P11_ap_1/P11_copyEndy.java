package P11_ap_1;

import java.util.Arrays;

public class P11_copyEndy {
    public int[] copyEndy(int[] nums, int count) {
        return Arrays.stream(nums)
                .filter(n -> n <= 10 || (n >= 90 && n <= 100))
                .limit(count)
                .toArray();

    }

}
