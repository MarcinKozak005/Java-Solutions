package P09_array_2;

public class P31_withoutTen {
    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 10) continue;
            result[j++] = nums[i];
        }
        return result;
    }

}
