package P01_warmup_1;

public class P07_nearHundred {
    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }
}
