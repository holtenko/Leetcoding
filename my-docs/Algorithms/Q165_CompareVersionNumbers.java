import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/4/24
 */
class Q165_CompareVersionNumbers {
    public static void main(String[] args) {
        System.out.println(compareVersion("1.2", "1.1"));
    }

    public static int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = Math.max(len1, len2);
        for (int i = 0; i < len; i++) {
            int num1 = i < len1 ? Integer.parseInt(nums1[i]) : 0;
            int num2 = i < len2 ? Integer.parseInt(nums2[i]) : 0;
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }
        return 0;
    }
}