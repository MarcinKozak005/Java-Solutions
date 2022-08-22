package P09_array_2;

public class P26_tenRun {
    public int[] tenRun(int[] nums) {
        int multiple = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) multiple = nums[i];
            else if (multiple != -1) nums[i] = multiple;
        }
        return nums;
    }

}
