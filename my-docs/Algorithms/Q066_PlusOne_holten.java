/**
* Created by holten on 2016-08-29.
* Email: holten.ko@gmail.com
*/

public class Q066_PlusOne_holten {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(9<digits[i]+1){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits=new int[len+1];
        newDigits[0]=1;
        return newDigits;
    }
}