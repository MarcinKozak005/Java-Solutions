package P12_recursion_1;

public class P08_count8 {
    public int count8(int n) {
        if (n == 0) return 0;
        if (n % 100 == 88) return 2 + count8(n / 10);
        return n % 10 == 8 ? 1 + count8(n / 10) : count8(n / 10);
    }

}
