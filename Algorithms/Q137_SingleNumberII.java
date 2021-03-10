import java.util.HashSet;
import java.util.Set;

/**
 * @author holten
 * @date 2021/3/10
 */
class Q137_SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> notOnce = new HashSet<>();
        Set<Integer> appearOnce = new HashSet<>();
        for (int num : nums) {
            if (notOnce.contains(num)) {
                continue;
            }
            if (appearOnce.contains(num)) {
                notOnce.add(num);
                appearOnce.remove(num);
                continue;
            }
            appearOnce.add(num);
        }
        return appearOnce.iterator().next();
    }
}