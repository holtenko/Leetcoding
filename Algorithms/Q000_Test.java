import java.util.Arrays;

/**
 * @author holten
 * @date 2021/10/6
 */
class Q000_Test {
    public static void main(String[] args) {
        int[] A = {3, 2, 4, 1, 3, 6, 2, 7, 9, 1};
        int[] B = {3, 2, 4, 1, 3, 6, 2, 7, 9, 1};
        System.out.println(Arrays.toString(addBinary(A,B)));
    }

    public static int[] addBinary(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n + 1];
        int carry = 0;
        for (int i = 0; i < n; i++) {
            int sum = A[i] + B[i] + carry;
            C[i] = sum % 2;
            carry = sum / 2;
        }
        C[n]=carry;
        return C;
    }
}
