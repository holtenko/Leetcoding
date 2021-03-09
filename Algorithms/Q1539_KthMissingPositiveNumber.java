import java.util.Arrays;

/**
 * @author holten
 * @date 2021/3/8
 */
class Q1539_KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int length = arr.length;
        int allMiss = arr[length - 1] - length;
        if (k > allMiss) {
            return arr[length - 1] + k - allMiss;
        }
        int low = 0;
        int high = length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] - mid - 1 >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low + k;
    }
}