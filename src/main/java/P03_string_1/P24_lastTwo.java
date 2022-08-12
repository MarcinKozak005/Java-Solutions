package P03_string_1;

public class P24_lastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2) return str;
        int l = str.length();
        return str.substring(0, l - 2) + str.charAt(l - 1) + str.charAt(l - 2);
    }

}
