import DataStructure.TreeNode;

/**
 * @author holten
 * @date 2021/3/10
 */
class Q1006_ClumsyFactorial {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(clumsy(N));
    }

    public static int clumsy(int N) {
        int result = 0;
        int temp = 0;
        int sign = 1;
        for (int i = 1; i <= N; i++) {
            int num = N - i + 1;
            int operator = i % 4;
            if (operator == 1) {
                // *
                temp = sign * num;
                continue;
            }
            if (operator == 2) {
                // /
                temp = temp * num;
                continue;
            }
            if (operator == 3) {
                // +
                temp = temp / num;
                result = result + temp;
                temp = 0;
                continue;
            }
            if (operator == 0) {
                // -
                result = result + num;
                sign = -1;
                temp = 0;
                continue;
            }
        }
        return result + temp;
    }
}