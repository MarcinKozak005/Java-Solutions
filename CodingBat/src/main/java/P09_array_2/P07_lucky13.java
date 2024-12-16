package P09_array_2;

public class P07_lucky13 {
    public boolean lucky13(int[] nums) {
        for (int num : nums) if (num == 1 || num == 3) return false;
        return true;
    }

}
