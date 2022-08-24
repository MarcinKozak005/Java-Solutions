package P16_functional_1;

import java.util.List;

public class P01_doubling {
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

}
