package P06_logic_2;

public class P04_noTeenSum {
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        return (n == 15 || n == 16 || n < 13 || n > 19) ? n : 0;
    }
}
