/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

public class Q326_PowerofThree_holten {
    public boolean isPowerOfThree(int n) {
        return (n>0 && (int)(Math.log10(n)/Math.log10(3))-Math.log10(n)/Math.log10(3)==0);
    }
}
