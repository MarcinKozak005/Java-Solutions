package P07_string_2;

public class P21_wordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int w_length = word.length();
        for (int i = 0; i < str.length(); i++)
            if (str.startsWith(word, i)) {
                sb.append(i - 1 >= 0 ? str.charAt(i - 1) : "");
                sb.append(i + w_length < str.length() ? str.charAt(i + w_length) : "");
            }
        return sb.toString();
    }

}
