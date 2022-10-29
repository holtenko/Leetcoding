import java.util.HashMap;
import java.util.Map;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q567_PermutationinString {

    public static void main(String[] args) {
        Q567_PermutationinString q567PermutationinString = new Q567_PermutationinString();
        String s1 = "ab";
        String s2 = "dcda";
        System.out.println(q567PermutationinString.checkInclusion(s1, s2));
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        Map<Character, Integer> target = new HashMap<>();
        for (Character targetChar : s1.toCharArray()) {
            target.put(targetChar, target.getOrDefault(targetChar, 0) + 1);
        }
        int left = 0, right = s1.length();
        Map<Character, Integer> current = new HashMap<>();
        for (int i = left; i < right; i++) {
            Character character = s2.charAt(i);
            current.put(character, current.getOrDefault(character, 0) + 1);
        }
        if (isValid(target, current)) {
            return true;
        }
        while (right < s2.length()) {
            Character leftChar = s2.charAt(left++);
            Character rightChar = s2.charAt(right++);
            current.put(leftChar, current.getOrDefault(leftChar, 0) - 1);
            current.put(rightChar, current.getOrDefault(rightChar, 0) + 1);
            if (isValid(target, current)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid(Map<Character, Integer> target, Map<Character, Integer> current) {
        for (Character targetChar : target.keySet()) {
            if (!current.getOrDefault(targetChar, 0).equals(target.get(targetChar))) {
                return false;
            }
        }
        return true;
    }
}