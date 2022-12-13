public class P24_TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String regex = "<([^>]+)>([^<>]+)</\\1>";
        Pattern p = Pattern.compile(regex);
        while (testCases > 0) {
            String line = in.nextLine();
            Matcher m = p.matcher(line);

            if (m.find()) {
                do {
                    line = line.replaceAll(regex, "$2");
                    System.out.println(m.group(2));
                } while (m.find());
            } else System.out.println("None");
            testCases--;

        }
        in.close();
    }
}
