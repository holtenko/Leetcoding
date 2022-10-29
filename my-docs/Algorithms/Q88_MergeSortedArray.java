import java.util.Arrays;

/**
 * @author holten
 * @date 2021/3/26
 */
class Q88_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {8, 9, 10, 0, 0};
        int[] nums2 = {4, 5};
        merge(nums1, 3, nums2, 2);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (index1 < 0) {
                nums1[i] = nums2[index2--];
                continue;
            }
            if (index2 < 0) {
                return;
            }
            int n1 = nums1[index1];
            int n2 = nums2[index2];
            if (n1 < n2) {
                nums1[i] = n2;
                index2--;
            } else {
                nums1[i] = n1;
                index1--;
            }
        }
    }
}