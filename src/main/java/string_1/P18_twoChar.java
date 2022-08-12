package string_1;

public class P18_twoChar {
    public String twoChar(String str, int index) {
        if (index + 1 >= str.length() || index <= 0) return str.substring(0, 2);
        return str.substring(index, index + 2);
    }

}
