public class P41_JavaStack {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        boolean incorrect = false;
        while (sc.hasNext()) {
            incorrect = false;
            String input = sc.next();
            for (char c : input.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') stack.add(c);
                else {
                    if (!stack.isEmpty() &&
                            (stack.peek() == '(' && c == ')' ||
                                    stack.peek() == '[' && c == ']' ||
                                    stack.peek() == '{' && c == '}')) stack.pop();
                    else {
                        incorrect = true;
                        break;
                    }
                }
            }
            System.out.println(!incorrect && stack.isEmpty());
            stack.clear();
        }

    }
}
