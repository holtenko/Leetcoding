/**
* Created by holten on 2016-08-29.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) return dividend;
        if ((dividend == Integer.MIN_VALUE && divisor == -1)) return Integer.MAX_VALUE;
        if(dividend>0&&divisor>0) return negativeDivide(-dividend,-divisor);
        if(dividend<0&&divisor<0) return negativeDivide(dividend,divisor);
        if(dividend<0&&divisor>0) return -negativeDivide(dividend,-divisor);
        if(dividend>0&&divisor<0) return -negativeDivide(-dividend,divisor);
        return Integer.MAX_VALUE;
    }
    public int negativeDivide(int dividend, int divisor) {
        int rest = 0;
        while (dividend <= divisor) {
            int cur = divisor;
            int multiplier = 1;
            while (cur > dividend - cur) {
                cur = cur << 1;
                multiplier = multiplier << 1;
            }
            dividend -= cur;
            rest += multiplier;
        }
        return rest;
    }
}