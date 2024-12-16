package P04_array_1;

public class P21_swapEnds {
    public int[] swapEnds(int[] nums) {
        int tmp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = tmp;
        return nums;
    }

}
