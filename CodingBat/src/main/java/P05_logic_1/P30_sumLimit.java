package P05_logic_1;

public class P30_sumLimit {
    public int sumLimit(int a, int b) {
        return (String.valueOf(a).length() == String.valueOf(a + b).length()) ? a + b : a;
    }

}
