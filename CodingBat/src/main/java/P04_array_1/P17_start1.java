package P04_array_1;

public class P17_start1 {
    public int start1(int[] a, int[] b) {
        int result = 0;
        if (a.length > 0 && a[0] == 1) result++;
        if (b.length > 0 && b[0] == 1) result++;
        return result;
    }

}
