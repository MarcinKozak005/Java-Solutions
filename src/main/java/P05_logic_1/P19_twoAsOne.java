package P05_logic_1;

public class P19_twoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c ||
                b + c == a ||
                c + a == b;
    }

}
