/**
* Created by holten on 2016-08-29.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public String countAndSay(int n) {
        if (n <= 1) return "1";
        String prev = "1";
        for (int i = 2; i <= n; i++) {
            prev = read(prev);
        }
        return prev;
    }
    
    public static String read(String origin) {
        int count = 0;
        char current = origin.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < origin.length(); i++) {
            if (origin.charAt(i) == current) {
                ++count;
            } else {
                stringBuilder.append(count);
                stringBuilder.append(current);
                count = 1;
                current = origin.charAt(i);
            }
            if (i == origin.length() - 1) {
                stringBuilder.append(count);
                stringBuilder.append(current);
            }
        }
        return stringBuilder.toString();
    }
}