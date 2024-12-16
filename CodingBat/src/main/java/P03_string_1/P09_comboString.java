package P03_string_1;

public class P09_comboString {
    public String comboString(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }
}
