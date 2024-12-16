package P09_array_2;

public class P12_fizzArray2 {
    public String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) result[i] = String.valueOf(i);
        return result;
    }

}
