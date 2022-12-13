public class P32_JavaSubarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) tab[i] = s.nextInt();
        int sum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += tab[j];
                if (sum < 0) result++;
            }
            sum = 0;
        }
        System.out.println(result);
        s.close();
    }

}
