package P10_array_3;

public class P06_squareUp {
    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                result[n * i + j] = n - j;
                if (n - j == i + 1) break;
            }
        }
        return result;
    }

}
