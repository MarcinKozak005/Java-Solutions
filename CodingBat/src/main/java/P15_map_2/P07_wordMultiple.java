package P15_map_2;

import java.util.HashMap;
import java.util.Map;

public class P07_wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String s : strings) {
            if (result.containsKey(s)) result.put(s, true);
            else result.put(s, false);
        }
        return result;
    }

}
