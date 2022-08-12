package P02_warmup_2;

public class P11_stringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        int l = Math.min(a.length(), b.length());
        for (int i = 0; i < l - 1; i++) if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) count++;
        return count;
    }
}
