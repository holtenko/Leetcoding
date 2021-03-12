import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/10
 */
class Q896_MonotonicArray {
    public static void main(String[] args) {
        int[] A = {6,76,3,2,1};
        System.out.println(isMonotonic(A));
    }

    public static boolean isMonotonic(int[] A) {
        if (A.length <= 1) {
            return true;
        }
        int isIncrease = 0;
        for (int i = 1; i < A.length; i++) {
            int current = 0;
            if (A[i] > A[i - 1]) {
                current = 1;
            } else if (A[i] < A[i - 1]) {
                current = -1;
            }

            if (current > 0) {
                if (isIncrease == 0) {
                    isIncrease = 1;
                } else if (isIncrease < 0) {
                    return false;
                }
            } else if (current < 0) {
                if (isIncrease == 0) {
                    isIncrease = -1;
                } else if (isIncrease > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}