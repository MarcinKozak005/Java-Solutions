package P13_recursion_2;

public class P05_groupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (target < 0) return false;
        if (start >= nums.length) return (target == 0);
        int i = start + 1;
        while (i < nums.length && nums[start] == nums[i]) i++;
        if (groupSumClump(start + (i - start), nums, target - (i - start) * nums[start])) return true;
        return groupSumClump(start + (i - start), nums, target);
    }

}
