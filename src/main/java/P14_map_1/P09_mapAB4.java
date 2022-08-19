package P14_map_1;

import java.util.Map;

public class P09_mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            int avl = map.get("a").length();
            int bvl = map.get("b").length();
            if (avl == bvl) {
                map.put("a", "");
                map.put("b", "");
            } else map.put("c", avl > bvl ? map.get("a") : map.get("b"));
        }
        return map;
    }

}
