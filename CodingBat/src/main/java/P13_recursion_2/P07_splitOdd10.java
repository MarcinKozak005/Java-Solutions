package P13_recursion_2;

public class P07_splitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    public boolean helper(int[] source, int start, int a, int b) {
        if (start >= source.length) return (a % 10 == 0 && b % 2 == 1) || (b % 10 == 0 && a % 2 == 1);
        return helper(source, start + 1, a + source[start], b) || helper(source, start + 1, a, b + source[start]);
    }

}
