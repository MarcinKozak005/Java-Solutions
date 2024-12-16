package P12_recursion_1;

public class P20_endX {
    public String endX(String str) {
        if (str.length() < 2) return str;
        return str.charAt(0) == 'x' ?
                endX(str.substring(1)) + "x" :
                str.charAt(0) + endX(str.substring(1));

    }

}
