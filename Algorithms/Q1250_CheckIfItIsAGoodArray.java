
public class Q1250_CheckIfItIsAGoodArray {
    public static void main(String[] args) {
        int[] nums = {3, 6};
        System.out.println(isGoodArray(nums));
    }

    public static boolean isGoodArray(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = gcd(result, nums[i]);

        }
        return result == 1;
    }

    private static int gcd(int a, int b) {
        if (b > a) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        while (true) {
            int temp = a % b;
            if (temp == 0) {
                return b;
            } else {
                return gcd(b, temp);
            }
        }
    }
}