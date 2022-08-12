package P03_string_1;

public class P19_middleThree {
    public String middleThree(String str) {
        int l = str.length();
        return str.substring(l / 2 - 1, l / 2 + 2);
    }

}
