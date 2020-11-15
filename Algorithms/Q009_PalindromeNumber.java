/**
* Created by holten on 2016-07-05.
* Email: holten.ko@gmail.com
*/

public class Q009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=0;
        int num=x;
        while(num!=0){
            temp=temp*10+num%10;
            num/=10;
        }
        if(temp!=x) return false;
        return true;
    }
}