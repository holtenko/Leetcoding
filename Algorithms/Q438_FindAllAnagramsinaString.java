import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author holten
 * @date 2020-12-14
 * Email: holten.ko@gmail.com
 */

public class Q438_FindAllAnagramsinaString {

    public static void main(String[] args) {
        Q438_FindAllAnagramsinaString q567PermutationinString = new Q438_FindAllAnagramsinaString();
        String s = "abab";
        String p = "abc";
        System.out.println(q567PermutationinString.findAnagrams(s, p));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int pLength = p.length();
        if (s.length() < pLength) {
            return result;
        }
        Map<Character, Integer> pCharMap = new HashMap<>();
        for (Character pChar : p.toCharArray()) {
            pCharMap.put(pChar, pCharMap.getOrDefault(pChar, 0) + 1);
        }
        Map<Character, Integer> sCharMap = new HashMap<>();
        for (int index = 0; index < pLength; index++) {
            sCharMap.put(s.charAt(index), sCharMap.getOrDefault(s.charAt(index), 0) + 1);
        }
        if (pCharMap.equals(sCharMap)) {
            result.add(0);
        }
        for (int index = 0; index < s.length() - pLength; index++) {
            Character charToRemove = s.charAt(index);
            Character charToAdd = s.charAt(index + pLength);
            if (!charToRemove.equals(charToAdd)) {
                sCharMap.computeIfPresent(charToRemove, (key, count) -> count <= 1 ? null : count - 1);
                sCharMap.put(charToAdd, sCharMap.getOrDefault(charToAdd, 0) + 1);
            }
            if (pCharMap.equals(sCharMap)) {
                result.add(index + 1);
            }
        }
        return result;
    }
}