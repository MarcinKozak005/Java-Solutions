package P05_logic_1;

public class P26_redTicket {
    public int redTicket(int a, int b, int c) {
        if (a == b & b == c && a == 2) return 10;
        if (a == b && b == c) return 5;
        if (b != a && c != a) return 1;
        return 0;
    }
}
