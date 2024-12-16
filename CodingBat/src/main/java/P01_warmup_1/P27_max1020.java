package P01_warmup_1;

public class P27_max1020 {
    public int max1020(int a, int b) {
        boolean exA = (a < 10 || a > 20);
        boolean exB = (b < 10 || b > 20);

        if (exA && !exB) return b;
        else if (!exA && exB) return a;
        else if (exA && exB) return 0;
        else return Math.max(a, b);
    }
}
