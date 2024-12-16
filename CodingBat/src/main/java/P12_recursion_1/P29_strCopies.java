package P12_recursion_1;

public class P29_strCopies {
    public boolean strCopies(String str, String sub, int n) {
        return n <= stringCount(str, sub);
    }

    public int stringCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        return str.startsWith(sub) ?
                1 + stringCount(str.substring(1), sub) :
                stringCount(str.substring(1), sub);
    }

}
