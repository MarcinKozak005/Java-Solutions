package string_1;

import java.util.Collections;

public class P05_extraEnd {
    public String extraEnd(String str) {
        return String.join("", Collections.nCopies(3, str.substring(str.length() - 2)));
    }
}
