package string_1;

public class P32_withoutX {
    public String withoutX(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.startsWith("x")) sb.delete(0, 1);
        if (sb.length() == 0) return "";
        if (str.endsWith("x")) sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }

}
