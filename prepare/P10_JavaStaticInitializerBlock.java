public class P10_JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int h = s.nextInt();
        s.close();
        try{
            if (b <= 0 || h <= 0)
                throw new Exception("Breadth and height must be positive");
            System.out.println(b*h);
        }
        catch (Exception e) {System.out.println(e);}
    }
}
