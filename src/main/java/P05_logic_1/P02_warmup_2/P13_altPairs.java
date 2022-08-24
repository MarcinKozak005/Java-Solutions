package P05_logic_1.P02_warmup_2;

public class P13_altPairs {
    public String altPairs(String str) {
        StringBuilder sb = new StringBuilder();
        int j = 3; // j is by turns 1 and 3
        for (int i = 0; i < str.length(); i += j) {
            sb.append(str.charAt(i));
            j = (j + 2) % 4;
        }
        return sb.toString();
    }
}
