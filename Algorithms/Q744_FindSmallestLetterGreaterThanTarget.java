/**
 * @author holten
 * @date 2021/3/8
 */
class Q744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'b'};
        char target = 'b';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (low >= letters.length - 1 && letters[low] <= target) {
            return letters[0];
        } else {
            return letters[low];
        }
    }

}