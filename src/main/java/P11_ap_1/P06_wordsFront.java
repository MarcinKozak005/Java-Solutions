package P11_ap_1;

import java.util.Arrays;

public class P06_wordsFront {
    public String[] wordsFront(String[] words, int n) {
        return Arrays.copyOfRange(words, 0, n);
    }

}
