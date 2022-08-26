package P12_recursion_1;

public class P23_count11 {
    public int count11(String str) {
        if (str.length() <= 1) return 0;
        return str.startsWith("11") ?
                1 + count11(str.substring(2)) :
                count11(str.substring(1));
    }

}
