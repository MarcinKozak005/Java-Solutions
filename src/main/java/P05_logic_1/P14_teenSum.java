package P05_logic_1;

public class P14_teenSum {
    public int teenSum(int a, int b) {
        return (a <= 19 && a >= 13 ||
                b <= 19 && b >= 13) ? 19 : a + b;
    }

}
