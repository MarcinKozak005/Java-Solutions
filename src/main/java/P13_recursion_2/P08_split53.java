package P13_recursion_2;

public class P08_split53 {
    public boolean split53(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    public boolean helper(int[] source, int start, int fives, int threes) {
        if (start >= source.length) return fives == threes;
        if (source[start] % 5 == 0) return helper(source, start + 1, fives + source[start], threes);
        if (source[start] % 3 == 0) return helper(source, start + 1, fives, threes + source[start]);
        return helper(source, start + 1, fives + source[start], threes) || helper(source, start + 1, fives, threes + source[start]);
    }

}
