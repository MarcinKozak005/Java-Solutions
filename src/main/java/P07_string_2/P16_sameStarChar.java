package P07_string_2;

public class P16_sameStarChar {
    public boolean sameStarChar(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && i - 1 >= 0 && i + 1 <= str.length() - 1 && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }
        return true;
    }

}
