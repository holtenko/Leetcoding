
/**
 * @author holten
 * @date 2021/3/15
 */
class Q693_BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(hasAlternatingBits(n));
    }

    public static boolean hasAlternatingBits(int n) {
        int r = -1;
        while (n > 0) {
            int cur = n % 2;
            if (r == cur) {
                return false;
            }
            r = cur;
            n = n / 2;
        }
        return true;
    }
}