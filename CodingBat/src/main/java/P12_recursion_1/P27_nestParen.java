package P12_recursion_1;

public class P27_nestParen {
    public boolean nestParen(String str) {
        if (str.length() == 0) return true;
        if (str.length() == 1) return false;
        return str.startsWith("(") && str.endsWith(")") && nestParen(str.substring(1, str.length() - 1));
    }

}
