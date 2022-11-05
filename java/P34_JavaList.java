public class P34_JavaList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> arr = new LinkedList<>();
        int n = s.nextInt();
        for (int i=0;i<n;i++) arr.add(s.nextInt());
        int q = s.nextInt();
        for (int i=0; i<q; i++){
            if(s.next().equals("Insert")){
                arr.add(s.nextInt(),s.nextInt());
            } else arr.remove(s.nextInt());
        }
        s.close();
        arr.forEach(e -> System.out.print(e+" "));
    }
}
