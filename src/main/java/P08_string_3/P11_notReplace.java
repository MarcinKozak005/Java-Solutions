package P08_string_3;

public class P11_notReplace {
    public String notReplace(String str) {
        return str.replaceAll("(?<!\\w)is(?!\\w)", "is not");
    }

}
