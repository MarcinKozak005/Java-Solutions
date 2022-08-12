package P03_string_1;

public class P06_firstTwo {
    public String firstTwo(String str) {
        if (str.length() < 3) return str;
        return str.substring(0, 2);
    }
}
