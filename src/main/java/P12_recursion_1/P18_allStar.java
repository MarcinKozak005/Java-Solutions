package P12_recursion_1;

public class P18_allStar {
    public String allStar(String str) {
        if (str.length() <= 1) return str;
        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }
}
