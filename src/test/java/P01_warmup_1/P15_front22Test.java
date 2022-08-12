package P01_warmup_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P15_front22Test {

    P15_front22 obj = new P15_front22();

    @Test
    void kittenEquals_kitten() {
        assertEquals("kikittenki", obj.front22("kitten"));
    }

    @Test
    void HaEqualsHaHaHa() {
        assertEquals("HaHaHa", obj.front22("Ha"));
    }

    @Test
    void abcEquals_abcabcabc() {
        assertEquals("ababcab", obj.front22("abc"));
    }

    @Test
    void abEquals_ababab() {
        assertEquals("ababab", obj.front22("ab"));
    }

    @Test
    void aEquals_aaa() {
        assertEquals("aaa", obj.front22("a"));
    }

    @Test
    void emptyStringEqualsEmptyString() {
        assertEquals("", obj.front22(""));
    }

    @Test
    void LogicEqualsLoLogicLo() {
        assertEquals("LoLogicLo", obj.front22("Logic"));
    }
}