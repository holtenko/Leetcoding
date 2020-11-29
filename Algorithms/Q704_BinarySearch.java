
/**
 * @author holten
 * @date 2020-11-22
 * Email: holten.ko@gmail.com
 */
public class Q704_BinarySearch {
    public static void main(String[] args) {
        Q704_BinarySearch q704BinarySearch = new Q704_BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 3;
        System.out.println(q704BinarySearch.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}