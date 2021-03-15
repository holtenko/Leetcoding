import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/8
 */
class Q1556_ThousandSeparator {
    public static void main(String[] args) {
        int n = 5104;
        System.out.println(thousandSeparator(n));
    }

    public static String thousandSeparator(int n) {
        String nString = String.valueOf(n);
        if (n < 1000) {
            return nString;
        }

        Stack<String> stack = new Stack<>();
        while (nString.length() > 3) {
            String cur = nString.substring(nString.length() - 3);
            stack.push(cur);
            nString = nString.substring(0, nString.length() - 3);
        }
        stack.push(nString);
        StringBuilder stringBuilder = new StringBuilder();
        while (stack.size() > 1) {
            stringBuilder.append(stack.pop()).append(".");
        }
        stringBuilder.append(stack.pop());
        return stringBuilder.toString();
    }
}