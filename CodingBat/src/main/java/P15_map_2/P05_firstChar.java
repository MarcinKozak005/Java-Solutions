package P15_map_2;

import java.util.HashMap;
import java.util.Map;

public class P05_firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        String s0;
        for (String s : strings) {
            s0 = s.substring(0, 1);
            if (result.containsKey(s0)) result.put(s0, result.get(s0) + s);
            else result.put(s0, s);
        }
        return result;
    }

}
