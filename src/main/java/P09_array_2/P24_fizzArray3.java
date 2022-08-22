package P09_array_2;


public class P24_fizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; start < end; i++) result[i] = start++;
        return result;
    }

}
