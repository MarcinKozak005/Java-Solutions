package P07_string_2;

public class P09_mixString {
    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; i < Math.min(a.length(), b.length()); i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        sb.append(a.substring(i));
        sb.append(b.substring(i));
        return sb.toString();
    }

}
