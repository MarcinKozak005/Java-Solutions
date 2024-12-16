package P03_string_1;

import java.util.Collections;

public class P21_atFirst {
    public String atFirst(String str) {
        int l = str.length();
        if (l < 2) return str.substring(0, l) + String.join("", Collections.nCopies(2 - l, "@"));
        return str.substring(0, 2);
    }

}
