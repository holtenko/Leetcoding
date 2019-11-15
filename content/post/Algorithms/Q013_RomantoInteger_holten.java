/**
* Created by holten on 2016-07-06.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public static int romanToInt(String s) {
		int result=0;
		int i=s.length()-1;
		if(s==null||i<0) return 0;
		while(i>=0){
			int current=RomanMap(s.charAt(i--),result);
			result+=current;
		}
		return result;
	}

	public static int RomanMap(char x,int result) {
		switch (x) {
		case 'I':return (result>=5?-1:1);
		case 'V':return 5;
		case 'X':return (result>=50?-10:10);
		case 'L':return 50;
		case 'C':return (result>=500?-100:100);
		case 'D':return 500;
		case 'M':return 1000;
		}
		return 0;
	}
}