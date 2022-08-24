package P05_logic_1.P02_warmup_2;

public class P04_doubleX {
    boolean doubleX(String str) {
        int ind = str.indexOf('x');
        if (ind == -1 || ind + 1 >= str.length()) return false;
        return str.charAt(ind + 1) == 'x';
    }
}
