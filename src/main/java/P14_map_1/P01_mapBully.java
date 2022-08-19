package P14_map_1;

import java.util.Map;

public class P01_mapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;

    }

}
