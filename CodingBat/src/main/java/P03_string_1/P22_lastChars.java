package P03_string_1;

public class P22_lastChars {
    public String lastChars(String a, String b) {
        char ca = a.isEmpty() ? '@' : a.charAt(0);
        char cb = b.isEmpty() ? '@' : b.charAt(b.length() - 1);
        return String.valueOf(ca) + cb;
    }

}
