package P09_array_2;

public class P25_shiftLeft {
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) return nums;
        int tmp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) nums[i] = nums[i + 1];
        nums[nums.length - 1] = tmp;
        return nums;
    }

}
