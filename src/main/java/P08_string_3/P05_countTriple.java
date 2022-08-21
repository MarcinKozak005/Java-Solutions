package P08_string_3;

public class P05_countTriple {
    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++)
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) count++;
        return count;
    }

}
