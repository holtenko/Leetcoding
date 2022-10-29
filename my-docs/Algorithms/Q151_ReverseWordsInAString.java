import java.util.Stack;

/**
 * @author holten
 * @date 2021/4/8
 */
public class Q151_ReverseWordsInAString {
    public static void main(String[] args) {
        String s = " a ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (curChar == ' ') {
                if (sb.length() > 0) {
                    stack.push(sb.toString());
                    sb.delete(0, sb.length());
                }
            } else {
                sb.append(curChar);
            }
        }
        if (sb.length() > 0 && !stack.isEmpty()) {
            sb.append(" ");
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}