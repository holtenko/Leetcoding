/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

import java.math.*;
public class Q062_UniquePaths_holten {
    public int uniquePaths(int m, int n) {
        int total=m+n-2;
        BigInteger result =factorial(total).divide((factorial(m-1).multiply(factorial(n-1))));
        return result.intValue();
        //return factorial(36).intValue();
    }
    
    public BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for(int i = 1;i <= n;i++)
            result = result.multiply(new BigInteger(i+""));
        return result;
    }
}