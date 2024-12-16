package P12_recursion_1;

public class P28_strCount {
    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        return str.startsWith(sub) ?
                1 + strCount(str.substring(sub.length()), sub) :
                strCount(str.substring(1), sub);
    }

}
