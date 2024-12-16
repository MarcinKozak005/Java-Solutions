package P04_array_1;

public class P27_front11 {
    public int[] front11(int[] a, int[] b) {
        if (a.length > 1 && b.length == 0) return new int[]{a[0]};
        if (a.length == 0 && b.length > 1) return new int[]{b[0]};
        if (a.length == 0 && b.length == 0) return new int[]{};
        return new int[]{a[0], b[0]};
    }
}
