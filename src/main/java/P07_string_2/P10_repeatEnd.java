package P07_string_2;

public class P10_repeatEnd {
    public String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(str.substring(str.length() - n));
        return sb.toString();
    }

}
