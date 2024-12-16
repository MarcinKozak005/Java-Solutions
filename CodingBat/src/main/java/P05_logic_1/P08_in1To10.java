package P05_logic_1;

public class P08_in1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        if (n == 1 || n == 10) return true;
        if (n > 1 && n < 10) return !outsideMode;
        return outsideMode;
    }
}
