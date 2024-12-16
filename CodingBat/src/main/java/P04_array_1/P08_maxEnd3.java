package P04_array_1;

public class P08_maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int m = Math.max(nums[0], nums[2]);
        return new int[]{m, m, m};
    }

}
