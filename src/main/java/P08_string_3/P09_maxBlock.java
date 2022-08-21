package P08_string_3;

public class P09_maxBlock {
    public int maxBlock(String str) {
        if (str.length() < 2) return str.length();
        int current = 1;
        int max = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) current += 1;
            else {
                max = Math.max(max, current);
                current = 1;
            }
        }
        return Math.max(max, current);
    }

}
