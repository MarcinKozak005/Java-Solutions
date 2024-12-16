package P12_recursion_1;

public class P07_count7 {
    public int count7(int n) {
        if (n == 0) return 0;
        return n % 10 == 7 ? 1 + count7(n / 10) : count7(n / 10);
    }

}
