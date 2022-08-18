package P06_logic_2;

public class P08_evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int big = Math.max(a, Math.max(b, c));
        int small = Math.min(a, Math.min(b, c));
        int medium = a + b + c - big - small;
        int diff = (big - small) / 2;
        return (small + diff == medium) && (big - diff == medium);
    }

}
