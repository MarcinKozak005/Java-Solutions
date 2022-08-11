package warmup_1;

public class P23_startOz {
    public String startOz(String str) {
        if (str.length() < 2) return str;
        StringBuilder sb = new StringBuilder();
        if (str.charAt(0) == 'o') sb.append('o');
        if (str.charAt(1) == 'z') sb.append('z');
        return sb.toString();
    }
}
