package P06_logic_2;

public class P01_makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        if (small + big * 5 < goal) return false;
        int rest = goal - 5 * Math.min(goal / 5, big);
        return small >= rest;
    }

}
