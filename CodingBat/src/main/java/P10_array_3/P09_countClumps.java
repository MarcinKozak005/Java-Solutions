package P10_array_3;

public class P09_countClumps {
    public int countClumps(int[] nums) {
        int number = 0;
        int current_clump = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                current_clump++;
            } else {
                number += current_clump >= 2 ? 1 : 0;
                current_clump = 1;
            }
        }
        if (current_clump > 1) number += 1;
        return number;
    }

}
