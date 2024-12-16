package P01_warmup_1;

public class P30_endUp {
    public String endUp(String str) {
        int l = str.length();
        if (l < 3) return str.toUpperCase();
        return str.substring(0, l - 3) + str.substring(l - 3).toUpperCase();
    }
}
