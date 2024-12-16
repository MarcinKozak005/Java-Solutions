package P01_warmup_1;

public class P09_notString {
    public String notString(String str) {
        if (str.startsWith("not")) return str;
        else return "not " + str;
    }
}
