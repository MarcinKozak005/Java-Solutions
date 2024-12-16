public class P53_JavaVarargsSimpleAddition {
    class Add {
        void add(int x, int y, int... args) {
            int sum = x + y;
            System.out.print(x + "+" + y);
            for (int i = 0; i < args.length; i++) {
                System.out.print("+" + args[i]);
                sum += args[i];
            }
            System.out.println("=" + sum);
        }
    }
}
