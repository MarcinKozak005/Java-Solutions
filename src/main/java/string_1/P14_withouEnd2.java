package string_1;

public class P14_withouEnd2 {
    public String withouEnd2(String str) {
        int l = str.length();
        if (l < 2) return "";
        return str.substring(1, l - 1);
    }

}
