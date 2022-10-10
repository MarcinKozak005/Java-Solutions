public class P28_JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println(x/y);
        } catch(ArithmeticException e){System.out.println(e.toString());}
        catch(InputMismatchException e){System.out.println(e.getClass().getCanonicalName());}
        s.close();
    }
}
