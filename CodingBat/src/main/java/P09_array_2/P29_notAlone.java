package P09_array_2;

public class P29_notAlone {
    public int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val && isAlone(nums, i)) nums[i] = Math.max(nums[i - 1], nums[i + 1]);
        }
        return nums;
    }

    public boolean isAlone(int[] nums, int index) {
        return index - 1 >= 0 && index + 1 < nums.length && nums[index - 1] != nums[index] && nums[index + 1] != nums[index];
    }

}
