/**
 * @author holten
 * @date 2021/4/24
 */
class Q4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {100001};
        int[] nums2 = {100000};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int media1 = (m + n + 1) / 2;
        int media2 = (m + n + 2) / 2;
        return (getKth(nums1, 0, nums2, 0, media1) + getKth(nums1, 0, nums2, 0, media2)) * 0.5;
    }

    private static int getKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        int len1 = nums1.length - start1;
        int len2 = nums2.length - start2;
        if (len1 > len2) {
            return getKth(nums2, start2, nums1, start1, k);
        }
        if (len1 == 0) {
            return nums2[start2 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int index1 = Math.min(nums1.length - 1, start1 + k / 2 - 1);
        int index2 = Math.min(nums2.length - 1, start2 + k / 2 - 1);
        if (nums1[index1] > nums2[index2]) {
            return getKth(nums1, start1, nums2, index2 + 1, k - (index2 - start2 + 1));
        } else {
            return getKth(nums1, index1 + 1, nums2, start2, k - (index1 - start1 + 1));
        }
    }
}