import java.util.Scanner;

public class P07_JavaLoopsII {
    public static void calculateSeries(int a, int b, int n) {
        int s0 = a + b;
        int result = s0;
        System.out.print(s0);
        for (int i = 1; i < n; i++) {
            result += Math.pow(2, i) * b;
            System.out.print(" " + result);
        }
        System.out.println();
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calculateSeries(a, b, n);
        }
        in.close();
    }
}
