package P12_recursion_1;

public class P01_factorial {
    public int factorial(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

}
