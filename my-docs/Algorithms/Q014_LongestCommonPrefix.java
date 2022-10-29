/**
* Created by holten on 2016-07-06.
* Email: holten.ko@gmail.com
*/

public class Q014_LongestCommonPrefix {
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length < 1) return "";
        int shortLen = Integer.MAX_VALUE;
        for (String str : strs) {
            shortLen = str.length() < shortLen ? str.length() : shortLen;
        }
        for (int i = 0; i < shortLen; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j - 1].charAt(i) != strs[j].charAt(i)) return strs[j].substring(0, i);
            }
        }
        return strs[0].substring(0, shortLen);
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length < 1) return "";
        int shortLen = Integer.MAX_VALUE;
        for (String str : strs) {
            shortLen = str.length() < shortLen ? str.length() : shortLen;
        }
        for (int i = 0; i < shortLen; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j - 1].charAt(i) != strs[j].charAt(i)) return strs[j].substring(0, i);
            }
        }
        return strs[0].substring(0, shortLen);
    }
}