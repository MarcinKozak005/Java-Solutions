package P07_string_2;

public class P17_oneTwo {
    public String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1 && i + 2 <= str.length() - 1; i += 3) {
            sb.append(str.charAt(i + 1));
            sb.append(str.charAt(i + 2));
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
