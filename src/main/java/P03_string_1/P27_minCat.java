package P03_string_1;

public class P27_minCat {
    public String minCat(String a, String b) {
        int m = Math.min(a.length(), b.length());
        return a.substring(a.length() - m) + b.substring(b.length() - m);
    }

}
