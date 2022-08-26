package P12_recursion_1;

public class P30_strDist {
    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.startsWith(sub)) {
            return str.endsWith(sub) ?
                    str.length() :
                    strDist(str.substring(0, str.length() - 1), sub);
        }
        return strDist(str.substring(1), sub);
    }

}
