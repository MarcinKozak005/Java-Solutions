package P05_logic_1;

public class P27_greenTicket {
    public int greenTicket(int a, int b, int c) {
        boolean ab = a == b, bc = b == c, ca = c == a;
        if (ab && bc) return 20;
        if (ab || bc || ca) return 10;
        return 0;
    }

}
