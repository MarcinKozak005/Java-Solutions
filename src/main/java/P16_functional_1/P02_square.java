package P16_functional_1;

import java.util.List;

public class P02_square {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

}
