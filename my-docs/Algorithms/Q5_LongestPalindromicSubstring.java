/**
 * @author holten
 * @date 2021/3/28
 */
class Q5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "aaaaaa";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int max = 1;
        int begin = 0;
        for (int center = 0; center < s.length() - 1; center++) {
            int odd = expand(s, center, center);
            int even = expand(s, center, center + 1);
            if (odd > even) {
                if (odd > max) {
                    max = odd;
                    begin = center - odd / 2;
                }
            } else {
                if (even > max) {
                    max = even;
                    begin = center - even / 2 + 1;
                }
            }
        }
        return s.substring(begin, begin + max);
    }

    private static int expand(String s, int left, int right) {
        if (s.charAt(left) != s.charAt(right)) {
            return 1;
        }
        int maxLen = right - left + 1;
        while (left > 0 && right < s.length() - 1) {
            if (s.charAt(--left) == s.charAt(++right)) {
                maxLen += 2;
            } else {
                break;
            }
        }
        return maxLen;
    }
}