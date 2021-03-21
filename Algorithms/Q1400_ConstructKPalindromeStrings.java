
/**
 * @author holten
 * @date 2021/3/21
 */
class Q1400_ConstructKPalindromeStrings {
    public static void main(String[] args) {
        String s = "qlkzenwmmnpkopu";
        int k = 15;
        System.out.println(canConstruct(s, k));
    }

    public static boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (charCount[i] % 2 != 0) {
                oddCount += charCount[i] % 2;
            }
            evenCount += charCount[i] / 2;
        }
        k = k - oddCount;
        if (k < 0) {
            return false;
        } else if (k == 0) {
            return true;
        } else {
            if (evenCount >= k) {
                return true;
            } else {
                if (2 * evenCount < k) {
                    return false;
                } else {
                    int costEven = k / 2;
                    evenCount -= costEven;
                    k -= 2 * costEven;
                    return evenCount >= k;
                }
            }
        }
    }
}