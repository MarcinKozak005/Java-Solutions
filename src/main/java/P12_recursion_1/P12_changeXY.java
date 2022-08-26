package P12_recursion_1;

public class P12_changeXY {
    public String changeXY(String str) {
        if (str.isEmpty()) return "";
        return str.startsWith("x") ?
                "y" + changeXY(str.substring(1)) :
                str.substring(0, 1) + changeXY(str.substring(1));
    }

}
