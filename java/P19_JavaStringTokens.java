public class P19_JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int toSkip = 0;
        String[] result = s.split("[^a-zA-Z]+");
        if(result.length > 0 && result[0].equals("")) toSkip = 1;
        System.out.println(result.length-toSkip);
        Arrays.stream(result).skip(toSkip).forEach(System.out::println);
        scan.close();
    }
}
