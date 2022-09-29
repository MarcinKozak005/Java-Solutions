public class P09_JavaEndOfFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while(s.hasNext()){
            System.out.println(++i+" "+s.nextLine());
        }
        s.close();
    }
}
