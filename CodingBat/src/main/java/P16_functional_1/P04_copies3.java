package P16_functional_1;

import java.util.List;

public class P04_copies3 {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }

}
