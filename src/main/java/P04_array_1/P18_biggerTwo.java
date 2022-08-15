package P04_array_1;

public class P18_biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sa = a[0] + a[1];
        int sb = b[0] + b[1];
        return sa >= sb ? a : b;
    }

}
