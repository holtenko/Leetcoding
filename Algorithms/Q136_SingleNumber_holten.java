/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        int index=0;
        while(index<nums.length) result=result^nums[index++];
        return result;
    }
}
