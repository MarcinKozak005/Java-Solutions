package P04_array_1;

public class P02_sameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        if (nums.length == 0) return false;
        return nums[0] == nums[nums.length - 1];
    }
}
