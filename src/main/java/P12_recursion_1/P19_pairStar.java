package P12_recursion_1;

public class P19_pairStar {
    public String pairStar(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, 1).equals(str.substring(1, 2)) ?
                str.charAt(0) + "*" + pairStar(str.substring(1)) :
                str.charAt(0) + pairStar(str.substring(1));

    }

}
