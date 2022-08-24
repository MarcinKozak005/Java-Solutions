package P05_logic_1.P02_warmup_2;

public class P12_stringX {
    public String stringX(String str) {
        if (str.length() < 3) return str;
        int l = str.length() - 1;
        return str.charAt(0) + str.substring(1, l).replace("x", "") + str.charAt(l);
    }
}
