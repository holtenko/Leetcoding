/**
* Created by holten on 2016-07-07.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public List<String> letterCombinations(String digits) {
		char[][] numMap = new char[10][];
		numMap[2] = new char[] { 'a', 'b', 'c' };
		numMap[3] = new char[] { 'd', 'e', 'f' };
		numMap[4] = new char[] { 'g', 'h', 'i' };
		numMap[5] = new char[] { 'j', 'k', 'l' };
		numMap[6] = new char[] { 'm', 'n', 'o' };
		numMap[7] = new char[] { 'p', 'q', 'r', 's' };
		numMap[8] = new char[] { 't', 'u', 'v' };
		numMap[9] = new char[] { 'w', 'x', 'y', 'z' };
		char[] digitsChars = digits.toCharArray();
		List<String> result = new ArrayList<>();
		result.add("");
		for (char digit : digitsChars) {
			if (digit == '0' || digit == '1'){
			    result.clear();
			    break;
			}
			List<String> resultTemp = new ArrayList<>();
			for (String pre : result) {
				for (char now : numMap[digit - '0']) {
					resultTemp.add(pre + now);
				}
			}
			result.clear();
			result.addAll(resultTemp);
		}
        if(result.contains("")) result.clear();
		return result;
    }
}