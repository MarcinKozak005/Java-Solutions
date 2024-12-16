package P05_logic_1;

public class P23_lessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 ||
                Math.abs(b - c) >= 10 ||
                Math.abs(c - a) >= 10;
    }

}
