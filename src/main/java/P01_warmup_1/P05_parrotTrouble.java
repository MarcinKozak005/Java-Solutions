package P01_warmup_1;

public class P05_parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (!talking) return false;
        return hour < 7 || hour > 20;
    }
}