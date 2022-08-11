package warmup_1;

public class P15_front22 {
    public String front22(String str) {
//      Pre Java11
//      if (str.length() < 2) return str + str + str;
        if (str.length() < 2) return str.repeat(3);
        String s = str.substring(0, 2);
        return s + str + s;
    }
}
