package P16_functional_1;

import java.util.List;

public class P08_lower {
    public List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }

}
