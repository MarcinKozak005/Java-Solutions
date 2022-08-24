package P15_map_2;

import java.util.HashMap;
import java.util.Map;

public class P04_wordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            if (result.containsKey(s)) result.put(s, result.get(s) + 1);
            else result.put(s, 1);
        }
        return result;
    }

}
