package P05_logic_1;

public class P21_inOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (a < b && b < c) || (equalOk && a <= b && b <= c);
    }

}
