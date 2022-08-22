package P09_array_2;

public class P13_no14 {
    public boolean no14(int[] nums) {
        boolean ones = false, fours = false;
        for (int n : nums) {
            if (n == 1) ones = true;
            else if (n == 4) fours = true;
            if (ones && fours) return false;
        }
        return true;
    }

}
