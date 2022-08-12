package warmup_2;

import java.util.Collections;

public class P02_frontTimes {
    public String frontTimes(String str, int n) {
        if (str.length() < 3) return String.join("", Collections.nCopies(n, str));
        return String.join("", Collections.nCopies(n, str.substring(0, 3)));
    }
}
