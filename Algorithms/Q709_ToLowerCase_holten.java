/**
 * Created by holten on 2019-09-06.
 * Email: holten.ko@foxmail.com
 */

class Solution {
    public String toLowerCase(String str) {
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>=65 && arr[i]<=90)
                arr[i] = (char)(arr[i] + 32);
        }
        return new String(arr);
    }
}