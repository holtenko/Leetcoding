import java.util.*;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q076_MinimumWindowSubstring {

    public static void main(String[] args) {
        Q076_MinimumWindowSubstring q076MinimumWindowSubstring = new Q076_MinimumWindowSubstring();
        String s = "AA";
        String t = "AB";
        System.out.println(q076MinimumWindowSubstring.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
        for (Character targetChar : t.toCharArray()) {
            target.put(targetChar, target.getOrDefault(targetChar, 0) + 1);
        }
        Map<Character, Integer> current = new HashMap<>();
        char[] originString = s.toCharArray();
        int left = 0, right = 0, start = 0, length = Integer.MAX_VALUE;
        while (right < originString.length) {
            addOne(target, current, originString[right]);
            while (isValid(target, current)) {
                Character leftChar = originString[left];
                if (right - left + 1 < length) {
                    start = left;
                    length = right - start + 1;
                }
                if (target.containsKey(leftChar) && current.getOrDefault(leftChar, 0) - 1 < target.get(leftChar)) {
                    break;
                } else {
                    removeOne(target, current, originString[left]);
                    left++;
                }
            }
            right++;
        }

        return length == Integer.MAX_VALUE ? "" : s.substring(start, start + length);
    }

    public void addOne(Map<Character, Integer> target, Map<Character, Integer> current, Character character) {
        if (target.containsKey(character)) {
            current.put(character, current.getOrDefault(character, 0) + 1);
        }
    }

    public void removeOne(Map<Character, Integer> target, Map<Character, Integer> current, Character character) {
        if (target.containsKey(character)) {
            if (current.getOrDefault(character, 0) - 1 <= 0) {
                current.remove(character);
            } else {
                current.put(character, current.get(character) - 1);
            }
        }
    }

    public boolean isValid(Map<Character, Integer> target, Map<Character, Integer> current) {
        for (Character targetChar : target.keySet()) {
            if (current.getOrDefault(targetChar, 0) < target.get(targetChar)) {
                return false;
            }
        }
        return true;
    }
}