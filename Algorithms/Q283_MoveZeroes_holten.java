/**
* Created by holten on 2016-07-04.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]==0){
                int temp=nums[i];
                for(int k=i;k<j;k++){
                    nums[k]=nums[k+1];
                }
                nums[j]=temp;
                --j;
            }else{
                i++;
            }
        }
    }
}