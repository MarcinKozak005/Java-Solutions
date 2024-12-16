package P03_string_1;

public class P23_conCat {
    public String conCat(String a, String b) {
        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;
        if (a.charAt(a.length() - 1) == b.charAt(0)) return a + b.substring(1);
        return a + b;
    }

}
