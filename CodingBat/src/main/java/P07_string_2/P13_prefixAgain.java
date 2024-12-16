package P07_string_2;

public class P13_prefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.matches(prefix + "(.*)" + prefix + "(.*)");
    }

}
