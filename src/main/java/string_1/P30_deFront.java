package string_1;

public class P30_deFront {
    public String deFront(String str) {
        String a = str.startsWith("a") ? "a" : "";
        String b = str.startsWith("b", 1) ? "b" : "";
        return a + b + str.substring(2);

    }

}
