/**
* Created by holten on 2016-08-29.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;      
    }
}

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] strings=s.split(" ");
        if (strings.length<=0) return 0;
        return strings[strings.length-1].length();
    }
}