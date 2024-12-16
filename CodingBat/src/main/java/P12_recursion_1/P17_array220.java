package P12_recursion_1;

public class P17_array220 {
    public boolean array220(int[] nums, int index) {
        if (index + 1 >= nums.length) return false;
        return nums[index] * 10 == nums[index + 1] || array220(nums, index + 1);

    }

}
