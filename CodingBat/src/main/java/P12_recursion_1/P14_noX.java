package P12_recursion_1;

public class P14_noX {
    public String noX(String str) {
        if (str.isEmpty()) return "";
        return str.startsWith("x") ?
                noX(str.substring(1)) :
                str.substring(0, 1) + noX(str.substring(1));
    }

}
