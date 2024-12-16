package P05_logic_1;

public class P24_withoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) return (die1 == 6 ? 1 : die1 + 1) + die2;
        return die1 + die2;
    }

}
