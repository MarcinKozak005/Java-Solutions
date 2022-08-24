package P05_logic_1.P02_warmup_2;

public class P03_countXX {
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') count++;
        }
        return count;
    }
}
