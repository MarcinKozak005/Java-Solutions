package P15_map_2;

import java.util.HashMap;
import java.util.Map;

public class P08_allSwap {
    public String[] allSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<String, String> first_word = new HashMap<>();
        Map<String, Integer> word_new_pos = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String first_letter = strings[i].substring(0, 1);
            if (first_word.containsKey(first_letter)) {
                String matched = first_word.get(first_letter);
                result[word_new_pos.get(matched)] = strings[i];
                result[i] = matched;
                first_word.remove(first_letter);
                word_new_pos.remove(matched);
            } else {
                first_word.put(first_letter, strings[i]);
                word_new_pos.put(strings[i], i);
            }
        }
        for (Map.Entry<String, Integer> e : word_new_pos.entrySet()) {
            result[e.getValue()] = e.getKey();
        }
        return result;
    }
}
