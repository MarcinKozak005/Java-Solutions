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
    float numOfNegative = 0;
    float numOfZeros = 0;
    float numOfPositive = 0;
        
    public static void plusMinus(List<Integer> arr) {
    Result result = new Result();
    arr.stream().forEach(elem -> {
        if(elem < 0) result.numOfNegative++;
        else if (elem == 0) result.numOfZeros++;
        else result.numOfPositive++;
    });
    System.out.printf(
        "%.4f\n%.4f\n%.4f",
        result.numOfPositive / arr.size(),
        result.numOfNegative / arr.size(),
        result.numOfZeros / arr.size());
    // My code end
    }

}

public class D01P01_PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
