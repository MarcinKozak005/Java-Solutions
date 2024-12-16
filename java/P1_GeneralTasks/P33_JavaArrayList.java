import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P33_JavaArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d;
        int[] tmp;
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d = s.nextInt();
            tmp = new int[d];
            for (int j = 0; j < d; j++) tmp[j] = s.nextInt();
            arr.add(tmp);
        }
        int q = s.nextInt();
        int x, y;
        for (int i = 0; i < q; i++) {
            x = s.nextInt();
            y = s.nextInt();
            try {
                System.out.println(arr.get(x - 1)[y - 1]);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        s.close();
    }
}
