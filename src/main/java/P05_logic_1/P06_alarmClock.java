package P05_logic_1;

public class P06_alarmClock {
    public String alarmClock(int day, boolean vacation) {
        day = (day + 1) % 7; // More convenient: 0=Sat,1=Sun, ...,6=Friday
        if (vacation) return day <= 1 ? "off" : "10:00";
        return day <= 1 ? "10:00" : "7:00";
    }

}
