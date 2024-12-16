package P01_warmup_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P12front3Test {
    P12_front3 obj = new P12_front3();

    @Test
    void JavaEquals_JavJavJav() {
        Assertions.assertEquals("JavJavJav", obj.front3("Java"));
    }

    @Test
    void ChocolateEquals_ChoChoCho() {
        Assertions.assertEquals("ChoChoCho", obj.front3("Chocolate"));
    }

    @Test
    void abcEquals_abcabcabc() {
        Assertions.assertEquals("abcabcabc", obj.front3("abc"));
    }

    @Test
    void abcXYZEquals_abcabcabc() {
        Assertions.assertEquals("abcabcabc", obj.front3("abcXYZ"));
    }

    @Test
    void abEquals_ababab() {
        Assertions.assertEquals("ababab", obj.front3("ab"));
    }

    @Test
    void aEquals_aaa() {
        Assertions.assertEquals("aaa", obj.front3("a"));
    }

    @Test
    void emptyStringEqualsEmptyString() {
        Assertions.assertEquals("", obj.front3(""));
    }

}
