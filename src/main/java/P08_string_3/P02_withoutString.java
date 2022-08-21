package P08_string_3;

public class P02_withoutString {
    public String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }

}
