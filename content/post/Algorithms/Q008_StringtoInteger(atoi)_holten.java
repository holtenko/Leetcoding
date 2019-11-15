/**
* Created by holten on 2016-07-05.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int myAtoi(String str) {
		int result = 0;
		str = str.trim();
		int sign = 1;
		int i = 0;
		if (str == null || str.length() < 1) return 0;
		// 负数
		if ('-' == str.charAt(0)) {
			++i;
			sign = -1;
		} else if ('+' == str.charAt(0)) {
			++i;
		}
		while (i < str.length() && '0' <= str.charAt(i) && str.charAt(i) <= '9') {
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && str.charAt(i) > '7')) {
				if (sign == -1) return Integer.MIN_VALUE;
				else return Integer.MAX_VALUE;
			}
			result = result * 10 + str.charAt(i++) - '0';
		}
		return result * sign;
    }
}