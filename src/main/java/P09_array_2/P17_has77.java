package P09_array_2;

public class P17_has77 {
    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && (nums[i] == nums[i + 1])) return true;
            if (i + 2 < nums.length && nums[i] == 7 && (nums[i] == nums[i + 2])) return true;
        }
        return false;
    }

}
