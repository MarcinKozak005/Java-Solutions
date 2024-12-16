package P09_array_2;

public class P06_has22 {
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) if (nums[i] == nums[i + 1] && nums[i] == 2) return true;
        return false;
    }

}
