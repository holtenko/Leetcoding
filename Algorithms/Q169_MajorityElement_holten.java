/**
* Created by holten on 2016-07-19.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}