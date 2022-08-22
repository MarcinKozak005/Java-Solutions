package P09_array_2;

public class P05_sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean skip = false;
        for (int i = 0; i < nums.length; i++) {
            if (skip && nums[i] == 7) {
                skip = false;
                continue;
            } else if (!skip && nums[i] == 6) skip = true;
            if (skip) continue;
            sum += nums[i];
        }
        return sum;
    }

}
