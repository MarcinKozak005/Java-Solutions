package P16_functional_1;

import java.util.List;

public class P03_addStar {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }

}
