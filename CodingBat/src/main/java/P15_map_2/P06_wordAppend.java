package P15_map_2;

import java.util.HashMap;
import java.util.Map;

public class P06_wordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s) + 1);
                if (count.get(s) % 2 == 0) sb.append(s);
            } else count.put(s, 1);
        }
        return sb.toString();
    }

}
