import java.util.Arrays;

/**
* Created by holten on 2016-07-19.
* Email: holten.ko@gmail.com
*/

public class Q169_MajorityElement_holten {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}