package P09_array_2;

public class P21_twoTwo {
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2)
                if (!(i - 1 >= 0 && nums[i - 1] == 2 || i + 1 < nums.length && nums[i + 1] == 2)) return false;
        return true;
    }

}
