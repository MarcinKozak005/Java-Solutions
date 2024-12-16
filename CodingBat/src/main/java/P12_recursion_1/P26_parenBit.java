package P12_recursion_1;

public class P26_parenBit {
    public String parenBit(String str) {
        if (str.startsWith("(")) {
            return str.endsWith(")") ?
                    str :
                    parenBit(str.substring(0, str.length() - 1));
        } else return parenBit(str.substring(1));
    }

}
