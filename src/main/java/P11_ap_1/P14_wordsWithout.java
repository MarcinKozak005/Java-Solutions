package P11_ap_1;

import java.util.Arrays;

public class P14_wordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        return Arrays.stream(words).filter(s -> !s.equals(target)).toArray(String[]::new);
    }

}
