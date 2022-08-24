package P05_logic_1.P02_warmup_2;

public class P06_stringSplosion {
    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) sb.append(str.substring(0, i));
        return sb.toString();
    }
}
