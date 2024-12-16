package P08_string_3;

public class P06_sumDigits {
    public int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) if (Character.isDigit(c)) sum += Integer.parseInt(String.valueOf(c));
        return sum;
    }

}
