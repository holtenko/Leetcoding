import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/4/11
 */
class Q8_StringToInteger_atoi {
    public static void main(String[] args) {
        String s ="00000-42a1234";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() < 1) {
            return 0;
        }
        List<Integer> digits = new ArrayList<>();
        boolean isNegative = false;
        char firstChar = s.charAt(0);
        if (firstChar == '+') {
            isNegative = false;
        } else if (firstChar == '-') {
            isNegative = true;
        } else if (firstChar > '0' && firstChar <= '9') {
            digits.add(firstChar - '0');
        } else if (firstChar != '0') {
            return 0;
        }
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' && digits.isEmpty()) {
                continue;
            } else if (c >= '0' && c <= '9') {
                digits.add(c - '0');
            } else {
                break;
            }
        }
        long result = 0;
        int len = digits.size();
        if (len < 1) {
            return 0;
        } else if (len > 10) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        } else {
            for (int i = 0; i < len; i++) {
                int digit = digits.get(i);
                result = (long) (result + digit * Math.pow(10, len - i - 1));
            }
            if (isNegative) {
                result = -result;
            }
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int) result;
            }
        }
    }
}