package P09_array_2;

public class P18_has12 {
    public boolean has12(int[] nums) {
        boolean one = false;
        for (int n : nums) {
            if (n == 1) one = true;
            else if (n == 2 && one) return true;
        }
        return false;
    }

}
