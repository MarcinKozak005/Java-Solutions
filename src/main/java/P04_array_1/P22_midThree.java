package P04_array_1;

public class P22_midThree {
    public int[] midThree(int[] nums) {
        int p = nums.length / 2;
        return new int[]{nums[p - 1], nums[p], nums[p + 1]};
    }

}
