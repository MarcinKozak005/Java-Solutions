package P14_map_1;

import java.util.Map;

public class P08_mapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) return map;
        if (map.containsKey("a")) map.put("b", map.get("a"));
        if (map.containsKey("b")) map.put("a", map.get("b"));
        return map;
    }

}
