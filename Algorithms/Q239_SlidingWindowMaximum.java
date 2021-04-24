import java.util.*;

/**
 * @author holten
 * @date 2021/4/24
 */
class Q239_SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((p1, p2) -> p1.value == p2.value ? p1.index - p2.index : p2.value - p1.value);
        for (int i = 0; i < k - 1; i++) {
            priorityQueue.add(new Pair(i, nums[i]));
        }
        for (int i = k - 1; i < nums.length; i++) {
            int left = i - k + 1;
            int right = i;
            priorityQueue.add(new Pair(i, nums[i]));
            Pair top = priorityQueue.peek();
            while (top.index < left || top.index > right) {
                priorityQueue.poll();
                top = priorityQueue.peek();
            }
            result[left] = top.value;
        }
        return result;
    }

    static class Pair {
        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public int getValue() {
            return value;
        }
    }
}