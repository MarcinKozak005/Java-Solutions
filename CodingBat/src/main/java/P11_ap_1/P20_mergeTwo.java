package P11_ap_1;

public class P20_mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int cmp;
        for (int i = 0, ia = 0, ib = 0; i < n; i++) {
            cmp = (a[ia].compareTo(b[ib]));
            if (cmp < 0) result[i] = a[ia++];
            else if (cmp > 0) result[i] = b[ib++];
            else {
                result[i] = a[ia++];
                ib++;
            }
        }
        return result;
    }
}
