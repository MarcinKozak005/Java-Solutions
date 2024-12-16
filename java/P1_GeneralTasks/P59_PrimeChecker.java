public class P59_PrimeChecker {
    class Prime {
        // Solved in Java 7, not Java 8. The "import static ..." is important
        void checkPrime(int... args) {
            boolean isPrime;
            for (int i = 0; i < args.length; i++) {
                isPrime = true;
                if (args[i] == 1) continue;
                for (int j = 2; j < args[i]; j++) {
                    if (args[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) System.out.print(args[i] + " ");
            }
            System.out.println();
        }
    }
}
