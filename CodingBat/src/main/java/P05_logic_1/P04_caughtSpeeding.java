package P05_logic_1;

public class P04_caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int change = isBirthday ? 5 : 0;
        if (speed > 80 + change) return 2;
        if (speed >= 61 + change) return 1;
        return 0;
    }
}
