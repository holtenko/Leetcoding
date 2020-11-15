import java.util.HashSet;

/**
 *
 * @author holten
 * @date 2016-07-06
 * Email: holten.ko@gmail.com
 */

public class Q003_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int start = 0;
        int end = 1;
        int max = 1;
        HashSet<Character> set = new HashSet();
        set.add(s.charAt(start));
        while (end < s.length()) {
            set.add(s.charAt(end));
            max = Math.max(set.size(), max);
            end++;
            while (set.size() < (end - start)) {
                if (s.charAt(start) != s.charAt(end - 1)) {
                    set.remove(s.charAt(start));
                }
                start++;
            }
        }
        return max;
    }
}