package string_1;

public class P29_without2 {
    public String without2(String str) {
        int l = str.length();
        if (l > 1 && str.startsWith(str.substring(l - 2))) return str.substring(2);
        return str;
    }

}
