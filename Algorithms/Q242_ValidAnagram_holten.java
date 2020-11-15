import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* Created by holten on 2016-07-18.
* Email: holten.ko@gmail.com
*/

public class Q242_ValidAnagram_holten {
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> m = new HashMap<>();
        for (Character c : s.toCharArray()) {
            int count = m.containsKey(c) ? m.get(c) : 0;
            m.put(c, ++count);
        }
        for (Character c : t.toCharArray()) {
            int count = m.containsKey(c) ? m.get(c) : 0;
            if (count - 1 == 0) {
                m.remove(c);
            } else {
                m.put(c, --count);
            }
        }
        return m.size() == 0;
    }

    public boolean isAnagram3(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] schar=s.toCharArray();
        char[] tchar=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        for(int i=0;i<s.length();i++){
            if(schar[i]!=tchar[i]) return false;
        }
        return true;
    }
}