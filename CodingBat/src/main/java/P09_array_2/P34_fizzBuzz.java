package P09_array_2;

public class P34_fizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        String r;
        for (int i = 0; start < end; i++) {
            r = "";
            if (start % 3 == 0) r += "Fizz";
            if (start % 5 == 0) r += "Buzz";
            if (r.isEmpty()) r += String.valueOf(start);
            result[i] = r;
            start++;
        }
        return result;
    }

}
