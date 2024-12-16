package P03_string_1;

public class P04_makeOutWord {
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
