package P06_logic_2;

public class P05_roundSum {
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int n) {
        if (n % 10 >= 5) return ((n / 10) + 1) * 10;
        return (n / 10) * 10;
    }
}
