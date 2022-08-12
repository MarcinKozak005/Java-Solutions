package P03_string_1;

public class P17_nTwice {
    public String nTwice(String str, int n) {
        int l = str.length();
        return str.substring(0, n) + str.substring(l - n);
    }

}
