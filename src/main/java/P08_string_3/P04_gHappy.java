package P08_string_3;

public class P04_gHappy {
    public boolean gHappy(String str) {
        if (str.equals("g")) return false;
        return !(str.matches(".*[^g]g[^g].*") ||
                str.matches(".*[^g]g$") ||
                str.matches("^g[^g].*"));
    }

}
