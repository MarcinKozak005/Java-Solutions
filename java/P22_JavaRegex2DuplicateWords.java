
public class P22_JavaRegex2DuplicateWords {
    public static void main(String[] args) {

        String regex = "(?i)(^|\\b)(\\w+)( \\2)+($|\\b)";
        Pattern p = Pattern.compile(regex);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(regex, "$2");
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
