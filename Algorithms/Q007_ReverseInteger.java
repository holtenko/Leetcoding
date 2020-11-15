/**
* Created by holten on 2016-07-05.
* Email: holten.ko@gmail.com
*/

public class Q007_ReverseInteger {
    public int reverse(int x) {
		long result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
		return (int) result;
    }
}