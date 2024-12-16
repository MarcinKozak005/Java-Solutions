package P12_recursion_1;

public class P10_countX {
    public int countX(String str) {
        if (str.isEmpty()) return 0;
        return str.charAt(0) == 'x' ? 1 + countX(str.substring(1)) : countX(str.substring(1));
    }

}
