package P11_ap_1;

public class P21_commonTwo {
    public int commonTwo(String[] a, String[] b) {
        int result = 0, cmp, tmp;
        for (int ia = 0, ib = 0; ia < a.length && ib < b.length; ) {
            cmp = (a[ia].compareTo(b[ib]));
            if (cmp < 0) ia++;
            else if (cmp > 0) ib++;
            else {
                result++;
                tmp = ia;
                for (; ia < a.length; ia++) if (!a[ia].equals(a[tmp])) break;
                tmp = ib;
                for (; ib < b.length; ib++) if (!b[ib].equals(b[tmp])) break;
            }
        }
        return result;
    }

}
