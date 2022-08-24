package P05_logic_1.P02_warmup_2;

public class P01_stringTimes {
    public String stringTimes(String str, int n) {
        return str.repeat(n);
//        Before Java 11
//        return String.join("", Collections.nCopies(n, str));
    }
}
