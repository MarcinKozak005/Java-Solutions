package P09_array_2;

public class P32_zeroMax {
    public int[] zeroMax(int[] nums) {
        int maxOdd = -1;
        for (int i = nums.length - 1, j = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0 && maxOdd != -1) nums[i] = maxOdd;
            else maxOdd = nums[i] % 2 == 1 ? Math.max(maxOdd, nums[i]) : maxOdd;
        }
        return nums;
    }
}
