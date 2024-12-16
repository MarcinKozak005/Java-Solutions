package P05_logic_1;

public class P03_squirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        return (!isSummer && temp >= 60 && temp <= 90) ||
                (isSummer && temp >= 60 && temp <= 100);
    }
}
