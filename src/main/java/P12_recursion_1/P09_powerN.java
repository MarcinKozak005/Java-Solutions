package P12_recursion_1;

public class P09_powerN {
    public int powerN(int base, int n) {
        if (n == 0) return 1;
        return base * powerN(base, n - 1);
    }

}
