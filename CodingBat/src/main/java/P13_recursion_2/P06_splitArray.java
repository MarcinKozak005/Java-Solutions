package P13_recursion_2;

public class P06_splitArray {
    public boolean splitArray(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    public boolean helper(int[] source, int start, int a, int b) {
        if (start >= source.length) return a == b;
        return helper(source, start + 1, a + source[start], b) || helper(source, start + 1, a, b + source[start]);
    }
}
