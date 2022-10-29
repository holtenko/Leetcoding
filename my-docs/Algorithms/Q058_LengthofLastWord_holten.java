/**
* Created by holten on 2016-08-29.
* Email: holten.ko@gmail.com
*/

public class Q058_LengthofLastWord_holten {
    public int lengthOfLastWord1(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;      
    }

    public int lengthOfLastWord2(String s) {
        String[] strings=s.split(" ");
        if (strings.length<=0) return 0;
        return strings[strings.length-1].length();
    }
}