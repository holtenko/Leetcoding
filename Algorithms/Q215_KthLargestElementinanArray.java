/**
 * @author holten
 * @email holten.ko@gmail.com
 * @date 2021-03-04
 */

class Q215_KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 3;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        MinHeap minHeap = new MinHeap(k);
        for (int num : nums) {
            minHeap.insert(num);
        }
        return minHeap.getMin();
    }
}

class MinHeap {
    private final int[] heap;
    private int count;
    private final int size;

    public MinHeap(int size) {
        this.size = size;
        this.heap = new int[size + 1];
        this.count = 0;
    }

    public int getMin() {
        return heap[1];
    }

    public void insert(int num) {
        if (count < size) {
            int index = ++count;
            heap[index] = num;
            while (index / 2 > 0 && heap[index] < heap[index / 2]) {
                swap(index, index / 2);
                index = index / 2;
            }
        } else {
            if (num <= heap[1]) {
                return;
            }
            int index = 1;
            heap[index] = num;
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
    }

    private void swap(int from, int to) {
        int temp = heap[from];
        heap[from] = heap[to];
        heap[to] = temp;
    }
}