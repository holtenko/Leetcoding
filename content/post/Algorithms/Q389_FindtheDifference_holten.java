/**
* Created by holten on 2016-08-31.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public char findTheDifference(String s, String t) {
        char c = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            c ^= s.charAt(i) ^ t.charAt(i);
        }
        return c;
    }
}