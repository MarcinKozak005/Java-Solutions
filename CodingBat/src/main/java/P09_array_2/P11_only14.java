package P09_array_2;

public class P11_only14 {
    public boolean only14(int[] nums) {
        for (int n : nums) if (n != 1 && n != 4) return false;
        return true;
    }

}
