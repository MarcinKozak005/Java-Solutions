package P03_string_1;

public class P16_endsLy {
    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        return str.endsWith("ly");
    }
}
