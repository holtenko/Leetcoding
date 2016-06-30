/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int[] countBits(int num) {
		int[] result = new int[num + 1];
		int i = 1;
		int step = 1;
		while (i < num + 1) {
			for (int j = 0; j < step; j++) {
				result[i++] = result[j] + 1;
				if(i==num+1) break;
			}
			step += step;
		}
		return result;
    }
}