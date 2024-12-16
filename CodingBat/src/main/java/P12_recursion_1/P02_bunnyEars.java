package P12_recursion_1;

public class P02_bunnyEars {
    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

}
