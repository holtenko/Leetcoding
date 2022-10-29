import java.util.HashSet;

/**
 * Created by holten on 2018-02-12.
 * Email: holten.ko@foxmail.com
 */

class Q771_JewelsAndStones_holten {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] jArray = J.toCharArray();
        HashSet jSet = new HashSet();
        for (char j : jArray) {
            jSet.add(j);
        }
        char[] sArray = S.toCharArray();
        for (char s : sArray) {
            if (jSet.contains(s)) {
                result++;
            }
        }
        return result;
    }
}