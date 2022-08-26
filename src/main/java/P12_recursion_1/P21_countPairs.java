package P12_recursion_1;

public class P21_countPairs {
    public int countPairs(String str) {
        if (str.length() < 3) return 0;
        return str.charAt(0) == str.charAt(2) ?
                1 + countPairs(str.substring(1)) :
                countPairs(str.substring(1));
    }

}
