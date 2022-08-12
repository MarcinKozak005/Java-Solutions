package string_1;

public class P31_startWord {
    public String startWord(String str, String word) {
        if (str.length() == 1 && str.length() >= word.length()) return Character.toString(str.charAt(0));
        if (str.startsWith(word.substring(1), 1)) return str.charAt(0) + word.substring(1);
        return "";
    }

}
