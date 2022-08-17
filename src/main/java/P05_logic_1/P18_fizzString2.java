package P05_logic_1;

public class P18_fizzString2 {
    public String fizzString2(int n) {
        String result = "";
        if (n % 3 == 0) result += "Fizz";
        if (n % 5 == 0) result += "Buzz";
        return result.isEmpty() ? n + "!" : result + "!";
    }

}
