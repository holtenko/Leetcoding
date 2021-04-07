/**
 * @author holten
 * @date 2021/4/7
 */
class Q70_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }
        int dp0 = 1;
        int dp1 = 1;
        for (int i = 1; i < n; i++) {
            int temp = dp0 + dp1;
            dp0 = dp1;
            dp1 = temp;
        }
        return dp1;
    }
}