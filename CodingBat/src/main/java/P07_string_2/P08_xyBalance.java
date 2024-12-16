package P07_string_2;

public class P08_xyBalance {
    public boolean xyBalance(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') return true;
            if (str.charAt(i) == 'x') return false;
        }
        return true;
    }

}
