public class P25_JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        List<String> list = new ArrayList<>();
        for (String e : s) if (e != null) list.add(e);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return new BigDecimal(o2).compareTo(new BigDecimal(o1));
            }
        });
        s = list.toArray(new String[0]);
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
