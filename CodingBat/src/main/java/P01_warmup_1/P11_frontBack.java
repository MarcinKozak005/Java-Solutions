package P01_warmup_1;

public class P11_frontBack {
    public String frontBack(String str) {
        if (str.length() < 2) return str;
        int last = str.length() - 1;
        return str.charAt(last) + str.substring(1, last) + str.charAt(last);
    }
}