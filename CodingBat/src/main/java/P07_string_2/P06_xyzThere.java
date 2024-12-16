package P07_string_2;

public class P06_xyzThere {
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++)
            if (str.startsWith("xyz", i) && (i - 1 < 0 || str.charAt(i - 1) != '.')) return true;
        return false;
    }

}
