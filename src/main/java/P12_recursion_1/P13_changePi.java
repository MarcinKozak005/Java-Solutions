package P12_recursion_1;

public class P13_changePi {
    public String changePi(String str) {
        if (str.isEmpty()) return "";
        return str.startsWith("pi") ?
                "3.14" + changePi(str.substring(2)) :
                str.substring(0, 1) + changePi(str.substring(1));
    }
}
