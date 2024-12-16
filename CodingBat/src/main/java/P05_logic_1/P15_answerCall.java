package P05_logic_1;

public class P15_answerCall {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        if (isMom) return true;
        return !isMorning;
    }
}
