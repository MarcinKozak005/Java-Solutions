package P08_string_3;

public class P08_mirrorEnds {
    public String mirrorEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) result = string.substring(0, i + 1);
            else break;
        }
        return result;
    }

}
