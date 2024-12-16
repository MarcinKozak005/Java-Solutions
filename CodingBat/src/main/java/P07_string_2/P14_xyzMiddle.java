package P07_string_2;

public class P14_xyzMiddle {
    public boolean xyzMiddle(String str) {
        if (str.length() <= 3) return str.contains("xyz");
        int char_to_ommit = (str.length() - 3) / 2;
        return str.substring(char_to_ommit, str.length() - char_to_ommit).contains("xyz");
    }

}
