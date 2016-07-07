/**
* Created by holten on 2016-07-07.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=numRows||numRows==1) return s;
        char[] sChars=s.toCharArray();
        int step=(numRows-1)*2;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            sb.append(sChars[i]);
            int index=i;
            int cnt=1;
            while(true){
                if(cnt%2!=0){
                    index=index+step-2*i;
                    if(index>=sChars.length) break;
                    if(step-2*i!=0) sb.append(sChars[index]);
                    cnt++;
                }else{
                    index=index+2*i;
                    if(index>=sChars.length) break;
                    if(2*i!=0) sb.append(sChars[index]);
                    cnt++;
                }
            }
        }
        return sb.toString();
    }
}