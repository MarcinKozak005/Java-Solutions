import java.util.BitSet;
import java.util.Scanner;

public class P39_JavaBitSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        BitSet[] bt = new BitSet[]{new BitSet(), new BitSet()};
        int m = s.nextInt();
        s.nextLine(); // consume '\n' left after nextInt()
        String[] command;
        int arg1, arg2;
        for (int i = 0; i < m; i++) {
            command = s.nextLine().split(" ");
            arg1 = Integer.parseInt(command[1]);
            arg2 = Integer.parseInt(command[2]);
            switch (command[0]) {
                case "AND":
                    bt[arg1 - 1].and(bt[arg2 - 1]);
                    break;
                case "OR":
                    bt[arg1 - 1].or(bt[arg2 - 1]);
                    break;
                case "XOR":
                    bt[arg1 - 1].xor(bt[arg2 - 1]);
                    break;
                case "SET":
                    bt[arg1 - 1].set(arg2);
                    break;
                case "FLIP":
                    bt[arg1 - 1].flip(arg2);
                    break;
            }
            System.out.println(bt[0].cardinality() + " " + bt[1].cardinality());
        }
        s.close();
    }
}
