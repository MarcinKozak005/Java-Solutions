package P13_recursion_2;

public class P04_groupSum5 {
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (nums[start] % 5 == 0) {
            if (start + 1 >= nums.length) return (target - nums[start] == 0);
            return nums[start + 1] == 1 ?
                    groupSum5(start + 2, nums, target - nums[start]) :
                    groupSum5(start + 1, nums, target - nums[start]);
        }
        if (groupSum5(start + 1, nums, target - nums[start])) return true;
        return groupSum5(start + 1, nums, target);
    }

}
