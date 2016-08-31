/**
* Created by holten on 2016-08-31.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(j>i){
            while(!((s.charAt(i)>47&&s.charAt(i)<58)||(s.charAt(i)>96&&s.charAt(i)<122))&&j>i) i++;
            while(!((s.charAt(j)>47&&s.charAt(j)<58)||(s.charAt(j)>96&&s.charAt(j)<122))&&j>i) j--;
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
}