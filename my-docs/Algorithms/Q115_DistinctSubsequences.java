
/**
 * @author holten
 * @date 2021/3/10
 */
class Q115_DistinctSubsequences {
    public static void main(String[] args) {
        String s = "adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeaedcdebeecdaaedaacadbdccabddaddacdddc";
        String t = "bcddceeeebecbc";
        Q115_DistinctSubsequences q = new Q115_DistinctSubsequences();
        System.out.println(q.numDistinct(s, t));
    }

    private long[][] memo;
    private String s;
    private String t;
    private int sLen;
    private int tLen;

    public int numDistinct(String s, String t) {
        this.s = s;
        this.t = t;
        this.sLen = s.length();
        this.tLen = t.length();
        this.memo = new long[sLen][tLen];
        for (int i = 0; i < sLen; i++) {
            for (int j = 0; j < tLen; j++) {
                memo[i][j] = -1;
            }
        }
        return (int) dp(0, 0);
    }

    private long dp(int sIndex, int tIndex) {
        if (tIndex == tLen) {
            return 1;
        }
        if (sIndex == sLen) {
            return 0;
        }
        if (memo[sIndex][tIndex] != -1) {
            return memo[sIndex][tIndex];
        }
        long result;
        if (s.charAt(sIndex) == t.charAt(tIndex)) {
            result = dp(sIndex + 1, tIndex) + dp(sIndex + 1, tIndex + 1);
        } else {
            result = dp(sIndex + 1, tIndex);
        }
        memo[sIndex][tIndex] = result;
        return result;
    }
}