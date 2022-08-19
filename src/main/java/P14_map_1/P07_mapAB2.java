package P14_map_1;

import java.util.Map;
import java.util.Objects;

public class P07_mapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (Objects.equals(map.get("a"), map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

}
