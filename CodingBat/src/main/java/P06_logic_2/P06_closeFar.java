package P06_logic_2;

public class P06_closeFar {
    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(a - b) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) ||
                (Math.abs(a - c) <= 1 && Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2);
    }

}
