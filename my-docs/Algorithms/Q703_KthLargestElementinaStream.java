/**
 * @author holten
 * @email holten.ko@gmail.com
 * @date 2021-03-04
 */

class Q703_KthLargestElementinaStream {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 3;
        KthLargest obj = new KthLargest(k, nums);
        int param_1 = obj.add(1);
        System.out.println(param_1);
    }
}

class KthLargest {
    private final int[] heap;
    private int count;
    private final int size;

    public KthLargest(int k, int[] nums) {
        this.size = k;
        this.heap = new int[k + 1];
        this.count = 0;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (count < size) {
            int index = ++count;
            heap[index] = val;
            while (index / 2 > 0 && heap[index] < heap[index / 2]) {
                swap(index, index / 2);
                index = index / 2;
            }
        } else {
            if (val <= heap[1]) {
                return heap[1];
            }
            int index = 1;
            heap[index] = val;
            while (true) {
                int minPos = index;
                if (2 * index <= size && heap[index] > heap[2 * index]) {
                    minPos = 2 * index;
                }
                if (2 * index + 1 <= size && heap[minPos] > heap[2 * index + 1]) {
                    minPos = 2 * index + 1;
                }
                if (minPos == index) {
                    break;
                }
                swap(index, minPos);
                index = minPos;
            }
        }
        return heap[1];
    }

    private void swap(int from, int to) {
        int temp = heap[from];
        heap[from] = heap[to];
        heap[to] = temp;
    }
}