package P10_array_3;

public class P03_fix45 {
    public int[] fix45(int[] nums) {
        int[] result = new int[nums.length];
        // Rewrite all 4's and add 5's after them
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                result[i++] = 4;
                result[i] = 5;
            }
        }
        int j = 0;
        // Rewrite rest of the numbers
        for (int num : nums) {
            if (num != 4 && num != 5) {
                for (; j < result.length; j++) if (result[j] == 0) break;
                result[j++] = num;
            }
        }
        return result;
    }

}
