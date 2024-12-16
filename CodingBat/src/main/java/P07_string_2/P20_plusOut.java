package P07_string_2;

public class P20_plusOut {
    public String plusOut(String str, String word) {
        return str.replace(word, "\n").replaceAll(".", "+").replace("\n", word);
    }

}
