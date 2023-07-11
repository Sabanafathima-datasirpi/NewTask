import java.util.Stack;

public class Expression {public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openingSymbol = stack.pop();

                if ((c == ')' && openingSymbol != '(') ||
                        (c == '}' && openingSymbol != '{') ||
                        (c == ']' && openingSymbol != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "((9 + 5) * [2 - 6]]";
        String exp2 = "([9 + 5] * [2 - 6])";
        
        
        System.out.println("Expression 1 is valid: " + isValidExpression(exp1));
        System.out.println("Expression 2 is valid: " + isValidExpression(exp2));
    }
}
