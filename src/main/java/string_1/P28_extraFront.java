package string_1;

import java.util.Collections;

public class P28_extraFront {
    public String extraFront(String str) {
        if (str.length() < 3) return String.join("", Collections.nCopies(3, str));
        return String.join("", Collections.nCopies(3, str.substring(0, 2)));
    }

}
