package P07_string_2;

public class P15_getSandwich {
    public String getSandwich(String str) {
        int fst = str.indexOf("bread");
        if (fst == -1) return "";
        str = str.substring(fst + 5);
        int snd = str.lastIndexOf("bread");
        if (snd == -1) return "";
        return str.substring(0, snd);
    }
}
