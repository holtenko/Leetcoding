import java.util.HashMap;
import java.util.Map;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class QOffer15 {

    public static void main(String[] args) {
        int n = Integer.parseUnsignedInt("11111111111111111111111111111101", 2);
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}