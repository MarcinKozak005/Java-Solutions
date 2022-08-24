package P15_map_2;

import java.util.HashMap;
import java.util.Map;

public class P03_pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String s : strings) result.put(s.substring(0, 1), s.substring(s.length() - 1));
        return result;
    }

}
