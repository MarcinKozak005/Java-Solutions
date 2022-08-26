package P02_warmup_2;

public class P05_stringBits {
    public String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) sb.append(str.charAt(i));
        return sb.toString();
    }
}
