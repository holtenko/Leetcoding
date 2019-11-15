/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public String reverseString(String s) {
        if(s==null||s.isEmpty()) return "";
		char[] chars = s.toCharArray();
		int i = 0, j = chars.length - 1;
		while (true) {
			if (i >= j) break;
			exch(chars, i++, j--);
		}
		return String.valueOf(chars);
    }
    
    private void exch(char[] chars, int pre, int next) {
		char temp = chars[pre];
		chars[pre] = chars[next];
		chars[next] = temp;
	}
}
