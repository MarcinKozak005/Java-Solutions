package warmup_1;

public class P01_sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation) return true;
        return !weekday;
    }
}
