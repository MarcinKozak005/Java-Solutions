package P14_map_1;

import java.util.Map;

public class P02_mapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) map.put("b", map.get("a"));
        map.remove("c");
        return map;
    }

}
