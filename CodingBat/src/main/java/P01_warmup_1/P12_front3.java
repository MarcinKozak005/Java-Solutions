package P01_warmup_1;

public class P12_front3 {
    public String front3(String str) {
        if (str.length() <= 3) return str.repeat(3);
        return str.substring(0, 3).repeat(3);

        // Pre Java 11
        // if (str.length() <=3 ) return str + str + str;
        // String s = str.substring(0,3);
        // return s+s+s;
    }


}
