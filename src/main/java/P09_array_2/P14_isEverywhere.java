package P09_array_2;

public class P14_isEverywhere {
    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) if (nums[i] != val && nums[i + 1] != val) return false;
        return true;
    }

}
