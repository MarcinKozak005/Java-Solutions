package P05_logic_1;

public class P29_shareDigit {
    public boolean shareDigit(int a, int b) {
        return (a / 10 != 0 && (a / 10 == b / 10 || a / 10 == b % 10) ||
                (a % 10 == b / 10 || a % 10 == b % 10));
    }

}
