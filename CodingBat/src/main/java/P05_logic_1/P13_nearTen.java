package P05_logic_1;

public class P13_nearTen {
    public boolean nearTen(int num) {
        // num+2 maps reminders from (8,9,0,1,2) to (0,1,2,3,4)
        return (num + 2) % 10 < 5;
    }

}
