package warmup_2;

public class P08_arrayCount9 {
    public int arrayCount9(int[] nums) {
        // With Streams/Lambdas
        // return (int) Arrays.stream(nums).filter((a) -> a == 9).count();

        // Classic
        int count = 0;
        for (int i : nums) if (i == 9) count++;
        return count;
    }
}
