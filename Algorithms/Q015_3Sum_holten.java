/**
* Created by holten on 2016-07-18.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //如果数组长度小于3直接返回
        if(nums.length < 3) return result;
        //排序数组
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            //如果最小的数大于0或者最大的数小于0直接返回
            if(nums[i] > 0||nums[nums.length-1]<0) break;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum <= 0) while(nums[j] == nums[++j] && j < k);
                if(sum >= 0) while(nums[k] == nums[--k] && j < k);
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        return result;
    }
}