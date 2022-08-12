package P03_string_1;

public class P15_middleTwo {
    public String middleTwo(String str) {
        int x = str.length() / 2 - 1;
        return str.substring(x, x + 2);
    }

}
