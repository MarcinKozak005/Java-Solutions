package warmup_1;

public class P08_posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (a * b < 0 && !negative) return true;
        return negative && a < 0 && b < 0;
    }
}
