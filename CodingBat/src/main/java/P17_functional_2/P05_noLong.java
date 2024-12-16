package P17_functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class P05_noLong {
    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(n -> n.length() < 4).collect(Collectors.toList());
    }

}
