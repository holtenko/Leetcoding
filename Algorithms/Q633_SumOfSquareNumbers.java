/**
 * @author holten
 * @date 2021/3/10
 */
class Q633_SumOfSquareNumbers {
    public static void main(String[] args) {
        int c = 999999999;
        System.out.println(judgeSquareSum(c));
        System.out.println(judgeSquareSum2(c));
    }

    public static boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }

    public static boolean judgeSquareSum2(int c) {
        int low = 0;
        int high = (int) Math.sqrt(c);
        while (low <= high) {
            int powerSum = low * low + high * high;
            if (powerSum == c) {
                return true;
            } else if (powerSum > c) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }
}