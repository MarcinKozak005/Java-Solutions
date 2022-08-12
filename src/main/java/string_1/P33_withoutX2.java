package string_1;

public class P33_withoutX2 {
    public String withoutX2(String str) {
        if (str.length() <= 2) return str.replace("x", "");
        return str.substring(0, 2).replace("x", "") + str.substring(2);
    }


}
