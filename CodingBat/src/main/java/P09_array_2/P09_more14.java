package P09_array_2;

public class P09_more14 {
    public boolean more14(int[] nums) {
        int ones = 0, fours = 0;
        for (int n : nums) {
            if (n == 1) ones++;
            else if (n == 4) fours++;
        }
        return ones > fours;
    }

}
