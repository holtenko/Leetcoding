/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
		int count = (n == 0) ? 0 : 1;
		while ((n = n & (n - 1)) != 0) count++;
		return count;
    }
}