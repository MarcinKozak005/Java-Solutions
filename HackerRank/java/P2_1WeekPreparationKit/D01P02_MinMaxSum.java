import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    // My code start
    // change in the original code all int to longs
    public static void miniMaxSum(List<Long> arr) {
        long min = arr.get(0);
        long max = arr.get(0);
        long sum = 0;
        for(Long e: arr){
            min = (e < min) ? e : min;
            max = (e > max) ? e : max;
            sum += e;
        }
        System.out.println((sum-max) + " " + (sum-min));
    }
    // My code end

}

public class D01P02_MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}