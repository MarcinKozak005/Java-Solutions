package P10_array_3;

public class P08_maxMirror {
    public int maxMirror(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 0;
        int max = -1;
        int prev_i;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0 && i <= j; j--) {
                if (nums[i] == nums[j]) {
                    count = 0;
                    prev_i = i;
                    while (i < nums.length && j >= 0 && nums[i] == nums[j]) {
                        count += 1;
                        i++;
                        j--;
                    }
                    i = prev_i;
                    max = Math.max(count, max);
                }
            }
        }
        return max;
    }
}
