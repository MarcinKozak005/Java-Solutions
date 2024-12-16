package P01_warmup_1;

public class P28_stringE {
    public boolean stringE(String str) {
        return str.matches("[^e]*([^e]*e[^e]*){1,3}[^e]*");
    }
}
