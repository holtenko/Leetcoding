import java.util.Arrays;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q179_LargestNumber {
    public static void main(String[] args) {
        int[] nums = {432, 43243};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsStr, (a, b) -> {
            String o1 = a + b;
            String o2 = b + a;
            return o2.compareTo(o1);
        });
        if ("0".equals(numsStr[0])) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : numsStr) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

}