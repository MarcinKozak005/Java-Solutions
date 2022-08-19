package P07_string_2;

public class P05_endOther {
    public boolean endOther(String a, String b) {
        String al = a.toLowerCase();
        String bl = b.toLowerCase();
        return al.endsWith(bl) || bl.endsWith(al);
    }

}
