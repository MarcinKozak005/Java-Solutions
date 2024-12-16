package P12_recursion_1;

public class P11_countHi {
    public int countHi(String str) {
        if (str.isEmpty()) return 0;
        return str.startsWith("hi") ? 1 + countHi(str.substring(1)) : countHi(str.substring(1));
    }

}
