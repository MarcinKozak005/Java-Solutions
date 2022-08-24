package P16_functional_1;

import java.util.List;

public class P07_rightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

}
