package P07_string_2;

public class P19_starOut {
    public String starOut(String str) {
        return str.replaceAll("\\*+", "*").replaceAll(".?\\*.?", "");
    }

}
