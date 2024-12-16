package P10_array_3;

public class P02_fix34 {
    public int[] fix34(int[] nums) {
        int[] result = new int[nums.length];
        // Rewrite all 3's and add 4's after them
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                result[i++] = 3;
                result[i] = 4;
            }
        }
        int j = 0;
        // Rewrite rest of the numbers
        for (int num : nums) {
            if (num != 3 && num != 4) {
                for (; j < result.length; j++) if (result[j] == 0) break;
                result[j++] = num;
            }
        }
        return result;
    }
}
