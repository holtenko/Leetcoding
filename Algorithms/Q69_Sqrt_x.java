/**
 * @author holten
 * @date 2021/4/6
 */
class Q69_Sqrt_x {
    public static void main(String[] args) {
        System.out.println(mySqrt(17));
    }

    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int lo = 1;
        int hi = x;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if ((long) mid * mid <= x) {
                result = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return result;
    }
}