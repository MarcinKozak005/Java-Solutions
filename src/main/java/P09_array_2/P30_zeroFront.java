package P09_array_2;

public class P30_zeroFront {
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = nums.length - 1, j = nums.length - 1; i >= 0; i--) if (nums[i] != 0) result[j--] = nums[i];
        return result;
    }

}
