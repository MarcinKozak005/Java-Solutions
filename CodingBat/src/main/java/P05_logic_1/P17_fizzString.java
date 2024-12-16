package P05_logic_1;

public class P17_fizzString {
    public String fizzString(String str) {
        String result = "";
        if (str.startsWith("f")) result += "Fizz";
        if (str.endsWith("b")) result += "Buzz";
        return result.isEmpty() ? str : result;
    }

}
