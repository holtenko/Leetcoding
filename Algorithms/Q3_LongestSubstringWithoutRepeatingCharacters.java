import java.util.HashSet;
import java.util.Set;

/**
 * @author holten
 * @date 2021/3/21
 */
class Q3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        Set<Character> charSet = new HashSet<>();
        int max = 0;
        while (right < s.length()) {
            char cur = s.charAt(right);
            if (charSet.contains(cur)) {
                while (true) {
                    char leftChar = s.charAt(left);
                    if (leftChar == cur) {
                        left++;
                        break;
                    } else {
                        left++;
                        charSet.remove(leftChar);
                    }
                }
            } else {
                charSet.add(cur);
            }
            int curLen = right - left + 1;
            max = curLen > max ? curLen : max;
            right++;
        }
        return max;
    }
}