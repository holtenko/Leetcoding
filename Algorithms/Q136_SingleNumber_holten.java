/**
* Created by holten on 2016-07-02.
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
