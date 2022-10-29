/**
* Created by holten on 2016-07-18.
* Email: holten.ko@gmail.com
*/

public class Q260_SingleNumberIII_holten {
    public int[] singleNumber1(int[] nums) {
        int xor=0;
        for(int num:nums) xor^=num;//得到两个单独数的异或值
        xor&=-xor;//得到该异或值最右边的那个1的位置，并用这个位置区分这两个数，因为两个数不同，必然有一个位置一个为1，一个为0
        int[] result={0,0};
        for(int num:nums){
            if((num & xor)==0){
                result[0]^=num;
            }else{
                result[1]^=num;
            }
        }
        return result;
    }

    public int[] singleNumber2(int[] nums) {
        int xor=0;
        for(int num:nums) xor^=num;//得到两个单独数的异或值
        xor&=-xor;//得到该异或值最右边的那个1的位置，并用这个位置区分这两个数，因为两个数不同，必然有一个位置一个为1，一个为0
        int[] result={0,0};
        for(int num:nums){
            if((num & xor)==0){
                result[0]^=num;
            }else{
                result[1]^=num;
            }
        }
        return result;
    }
}