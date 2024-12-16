package P01_warmup_1;

public class P21_delDel {
    public String delDel(String str) {
        if (str.startsWith("del", 1)) return str.charAt(0) + str.substring(4);
        return str;
    }
}
