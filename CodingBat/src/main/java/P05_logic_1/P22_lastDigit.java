package P05_logic_1;

public class P22_lastDigit {
    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10);
    }

}
