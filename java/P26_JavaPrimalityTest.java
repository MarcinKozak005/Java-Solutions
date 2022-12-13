public class P26_JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        System.out.println(
                (new BigInteger(n).isProbablePrime(1)) ? "prime" : "not prime");
        bufferedReader.close();
    }
}
