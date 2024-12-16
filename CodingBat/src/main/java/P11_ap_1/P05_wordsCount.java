package P11_ap_1;

import java.util.Arrays;

public class P05_wordsCount {
    public int wordsCount(String[] words, int len) {
        return (int) Arrays.stream(words).filter(s -> s.length() == len).count();
    }

}
