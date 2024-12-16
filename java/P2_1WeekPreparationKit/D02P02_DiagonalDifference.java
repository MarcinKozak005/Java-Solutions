import java.util.List;

public class D02P02_DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int sum1 = 0, sum2 = 0;
        for (int i=0;i<n;i++){
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(n-1-i);
        }
        return Math.abs(sum1 - sum2);
    }
}
