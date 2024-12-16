package P17_functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class P01_noNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }

}
