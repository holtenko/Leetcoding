import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q20_ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({}})"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if ((top == '(' && cur == ')') || (top == '{' && cur == '}') || (top == '[' && cur == ']')) {
                    stack.pop();
                } else {
                    stack.push(cur);
                }
            } else {
                stack.push(cur);
            }
        }
        return stack.isEmpty();
    }
}