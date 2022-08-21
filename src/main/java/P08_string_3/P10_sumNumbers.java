package P08_string_3;

public class P10_sumNumbers {
    public int sumNumbers(String str) {
        String[] numbers = str.split("[^0-9]+");
        int count = 0;
        for (String s : numbers) if (!s.equals("")) count += Integer.parseInt(s);
        return count;
    }

}
