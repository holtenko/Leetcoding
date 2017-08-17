/**
 * Created by holten on 2017-08-17.
 * Email: holten.ko@gmail.com
 */

public class Solution {
    public boolean judgeCircle(String moves) {
        int U = 0, D = 0, L = 0, R = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') U++;
            if (c == 'D') D++;
            if (c == 'L') L++;
            if (c == 'R') R++;
        }
        return (U == D) && (L == R);
    }
}