package P09_array_2;

public class P33_evenOdd {
    public int[] evenOdd(int[] nums) {
        int tmp;
        for (int i = 0, j = nums.length - 1; i < j; ) {
            if (nums[i] % 2 == 0 && nums[j] % 2 == 1) {
                i++;
                j--;
            } else if (nums[i] % 2 == 0) i++;
            else if (nums[j] % 2 == 1) j--;
            else {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }

}
