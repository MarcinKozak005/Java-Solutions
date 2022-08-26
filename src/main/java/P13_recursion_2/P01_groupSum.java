package P13_recursion_2;

public class P01_groupSum {
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (groupSum(start + 1, nums, target - nums[start])) return true;
        return groupSum(start + 1, nums, target);
    }

}
