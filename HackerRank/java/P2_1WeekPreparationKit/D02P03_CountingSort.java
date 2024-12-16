import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D02P03_CountingSort {
    class Result {
        public static List<Integer> countingSort(List<Integer> arr) {
            int[] result = new int[100];
            arr.stream().forEach(e -> {
                result[e] = result[e] + 1;
            });
            return Arrays.stream(result).boxed().collect(Collectors.toList());
        }
    }
}
