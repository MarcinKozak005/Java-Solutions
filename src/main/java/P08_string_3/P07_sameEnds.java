package P08_string_3;

public class P07_sameEnds {
    public String sameEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            int middle = (int) (string.length() / 2.0);
            if (string.substring(0, middle - i).equals(string.substring(string.length() - middle + i)))
                return string.substring(0, middle - i);
        }
        return result;
    }
}
