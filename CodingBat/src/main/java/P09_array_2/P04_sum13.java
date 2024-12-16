package P09_array_2;

public class P04_sum13 {
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) sum += nums[i];
            else i++;
        }
        return sum;
    }

}
