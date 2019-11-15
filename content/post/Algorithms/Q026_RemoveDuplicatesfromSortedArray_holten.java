/**
* Created by holten on 2016-07-07.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int result=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]) nums[result++]=nums[i];
        }
        return result;
    }
}