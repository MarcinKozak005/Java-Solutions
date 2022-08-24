package P05_logic_1.P02_warmup_2;

public class P07_last2 {
    public int last2(String str) {
        // Kinda strangely formulated description;
        int l = str.length();
        if (l < 2) return 0;
        String end = str.substring(l - 2);
        int count = 0;
        for (int i = 0; i < l - 2; i++) if (str.substring(i, i + 2).equals(end)) count++;
        return count;
    }
}
