package P16_functional_1;

import java.util.List;

public class P05_moreY {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }

}
