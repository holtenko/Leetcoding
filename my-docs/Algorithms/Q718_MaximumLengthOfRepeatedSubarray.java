/**
 * @author holten
 * @date 2021/4/11
 */
class Q718_MaximumLengthOfRepeatedSubarray {
    public static void main(String[] args) {
        int[] A = {3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};
        System.out.println(findLength(A, B));
    }

    public static int findLength(int[] A, int[] B) {
        int aLen = A.length;
        int bLen = B.length;
        int max = 0;
        int[][] dp = new int[aLen + 1][bLen + 1];
        for (int i = 1; i <= aLen; i++) {
            for (int j = 1; j <= bLen; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i - 1][j - 1] = 0;
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
}