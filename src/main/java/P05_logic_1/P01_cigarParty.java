package P05_logic_1;

public class P01_cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (!isWeekend && cigars >= 40 && cigars <= 60) ||
                (isWeekend && cigars >= 40);
    }
}
