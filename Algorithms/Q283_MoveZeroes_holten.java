/**
* Created by holten on 2016-07-04.
* Email: holten.ko@gmail.com
*/

public class Q283_MoveZeroes_holten {
    public void moveZeroes1(int[] nums) {
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

    public void moveZeroes2(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
            i++;
        }
        while(j<nums.length){
            nums[j++]=0;
        }
    }
}