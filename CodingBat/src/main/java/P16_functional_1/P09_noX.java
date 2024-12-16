package P16_functional_1;

import java.util.List;

public class P09_noX {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
    }

}
