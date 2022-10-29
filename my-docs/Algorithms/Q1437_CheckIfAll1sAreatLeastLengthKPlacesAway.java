
/**
 * @author holten
 * @email holten.ko@gmail.com
 * @date 2021-03-04
 */
class Q1437_CheckIfAll1sAreatLeastLengthKPlacesAway {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 0, 1};
        int k = 2;
        System.out.println(kLengthApart(nums, k));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int distance = 0;
        boolean alreadyStart = false;
        for (int num : nums) {
            if (num == 1) {
                if (alreadyStart) {
                    if (distance < k) {
                        return false;
                    } else {
                        distance = 0;
                    }
                } else {
                    alreadyStart = true;
                }
            }
            if (num == 0) {
                if (alreadyStart) {
                    distance++;
                }
            }
        }
        return true;
    }
}