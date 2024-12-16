package P04_array_1;

public class P14_makeLast {
    public int[] makeLast(int[] nums) {
        int[] tab = new int[2 * nums.length];
        tab[tab.length - 1] = nums[nums.length - 1];
        return tab;
    }

}
