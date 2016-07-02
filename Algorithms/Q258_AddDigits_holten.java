/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        int result;
        return (result=num%9)==0?9:result;
    }
}