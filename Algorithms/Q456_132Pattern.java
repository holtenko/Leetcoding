import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q456_132Pattern {
    public static void main(String[] args) {
        int[] nums = {3, 5, 0, 3, 4};
        System.out.println(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return false;
        }
        int[] min = new int[len];
        min[0] = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++) {
            min[i] = nums[i - 1] < min[i - 1] ? nums[i - 1] : min[i - 1];
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = len - 1; i >= 0; i--) {
            int cur = nums[i];
            while (!stack.isEmpty()) {
                int stackTop = stack.peek();
                if (cur > stackTop) {
                    if (stackTop > min[i]) {
                        return true;
                    }
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(cur);
        }
        return false;
    }

}