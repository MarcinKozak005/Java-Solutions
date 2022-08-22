package P09_array_2;

public class P20_haveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) count++;
            if (i + 1 < nums.length && nums[i] == 3 && nums[i + 1] == 3) return false;
        }
        return count == 3;
    }
}
