package P11_ap_1;

public class P09_dividesSelf {
    public boolean dividesSelf(int n) {
        int tmp = n;
        while (tmp != 0) {
            if (tmp % 10 == 0) return false;
            if (n % (tmp % 10) != 0) return false;
            tmp /= 10;
        }
        return true;
    }

}
