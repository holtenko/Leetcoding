import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q415_AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("10", "1"));
    }

    public static String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int length = Math.max(len1, len2);
        int add = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= length; i++) {
            int bit1 = len1 - i < 0 ? 0 : num1.charAt(len1 - i) - 48;
            int bit2 = len2 - i < 0 ? 0 : num2.charAt(len2 - i) - 48;
            int sum = bit1 + bit2 + add;
            add = sum / 10;
            stack.push(sum % 10);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (add > 0) {
            stringBuilder.append(add);
        }
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}