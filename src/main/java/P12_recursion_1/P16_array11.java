package P12_recursion_1;

public class P16_array11 {
    public int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        return nums[index] == 11 ? 1 + array11(nums, index + 1) : array11(nums, index + 1);
    }

}
