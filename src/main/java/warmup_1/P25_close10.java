package warmup_1;

public class P25_close10 {
    public int close10(int a, int b) {
        int da = Math.abs(10 - a);
        int db = Math.abs(10 - b);
        if (da > db) return b;
        else if (da < db) return a;
        return 0;
    }
}
