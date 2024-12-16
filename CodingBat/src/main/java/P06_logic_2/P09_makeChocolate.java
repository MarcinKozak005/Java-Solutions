package P06_logic_2;

public class P09_makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        if (small + big * 5 < goal) return -1;
        int rest = goal - 5 * Math.min(goal / 5, big);
        if (small >= rest) return rest;
        return -1;
    }

}
