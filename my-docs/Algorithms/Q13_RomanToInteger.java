import java.util.HashMap;
import java.util.Map;

/**
 * @author holten
 * @date 2021/3/15
 */
class Q13_RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            int cur = charMap.get(curChar);
            if (i == s.length() - 1) {
                total += cur;
            } else {
                if (subtract(curChar, s.charAt(i + 1))) {
                    total -= cur;
                } else {
                    total += cur;
                }
            }
        }
        return total;
    }

    private static boolean subtract(char curChar, char nextChar) {
        if (curChar == 'I' && (nextChar == 'V' || nextChar == 'X')) {
            return true;
        }
        if (curChar == 'X' && (nextChar == 'L' || nextChar == 'C')) {
            return true;
        }
        if (curChar == 'C' && (nextChar == 'D' || nextChar == 'M')) {
            return true;
        }
        return false;
    }
}
