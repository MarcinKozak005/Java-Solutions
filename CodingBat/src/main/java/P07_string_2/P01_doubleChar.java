package P07_string_2;

public class P01_doubleChar {
    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(c);
            result.append(c);
        }
        return result.toString();
    }

}
