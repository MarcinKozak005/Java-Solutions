package P16_functional_1;

import java.util.List;

public class P06_math1 {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(x -> (x + 1) * 10);
        return nums;
    }

}
