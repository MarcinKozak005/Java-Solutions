package P11_ap_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P07_wordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        return Arrays.stream(words).filter(s -> s.length() != len).collect(Collectors.toList());
    }

}
