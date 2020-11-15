/**
* Created by holten on 2016-07-19.
* Email: holten.ko@gmail.com
*/

public class Q171_ExcelSheetColumnNumber_holten {
    public int titleToNumber(String s) {
        char[] sChar=s.toCharArray();   
        int result=0;
        int base=1;
        for(int i=s.length()-1;i>=0;i--){
            result+=(sChar[i]-'A'+1)*base;
            base*=26;
        }
        return result;
    }
}