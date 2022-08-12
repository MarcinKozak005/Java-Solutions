package P03_string_1;

public class P20_hasBad {
    public boolean hasBad(String str) {
        return str.startsWith("bad") || str.startsWith("bad", 1);
    }

}
