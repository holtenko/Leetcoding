/**
* Created by holten on 2016-07-18.
* Email: holten.ko@gmail.com
*/

public class Q238_ProductofArrayExceptSelf_holten {
    public int[] productExceptSelf(int[] nums) {
        int length=nums.length;
        int[] result=new int[length];
        result[0]=1;
        for(int i=1;i<length;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=length-1;i>=0;i--){
            result[i]*=right;
            right*=nums[i];
        }
        return result;
    }
}