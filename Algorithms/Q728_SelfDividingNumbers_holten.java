import java.util.ArrayList;
import java.util.List;

/**
 * Created by holten on 2018-02-13.
 * Email: holten.ko@foxmail.com
 */

class Q728_SelfDividingNumbers_holten {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int now = left; now <= right; now++) {
            int i = now;
            while (i > 0) {
                if ((i % 10) == 0 || (now % (i % 10) != 0)) {
                    break;
                }
                i /= 10;
            }
            if (i == 0) {
                result.add(now);
            }        
        }
        return result;
    }
}