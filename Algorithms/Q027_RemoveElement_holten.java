/**
* Created by holten on 2016-07-08.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int index=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=val) nums[index++]=nums[i];
        }
        return index;
    }
}