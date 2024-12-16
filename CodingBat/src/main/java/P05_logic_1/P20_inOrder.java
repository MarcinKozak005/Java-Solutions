package P05_logic_1;

public class P20_inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (c > b && (b > a || bOk));
    }

}
