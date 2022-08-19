package P07_string_2;

public class P11_repeatFront {
    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) sb.append(str, 0, i);
        return sb.toString();
    }

}
