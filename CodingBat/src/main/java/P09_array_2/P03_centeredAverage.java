package P09_array_2;

public class P03_centeredAverage {
    public int centeredAverage(int[] nums) {
        int sum = 0, max = nums[0], min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return (sum - max - min) / (nums.length - 2);
    }

}
