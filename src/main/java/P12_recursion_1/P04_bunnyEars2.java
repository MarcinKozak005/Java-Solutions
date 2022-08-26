package P12_recursion_1;

public class P04_bunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies % 2 == 1) return 2 + bunnyEars2(bunnies - 1);
        return 3 + bunnyEars2(bunnies - 1);
    }

}
