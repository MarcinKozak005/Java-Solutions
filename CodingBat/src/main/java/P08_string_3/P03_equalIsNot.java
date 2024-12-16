package P08_string_3;

public class P03_equalIsNot {
    public boolean equalIsNot(String str) {
        return str.split("is", -1).length - 1 == str.split("not", -1).length - 1;
    }

}
