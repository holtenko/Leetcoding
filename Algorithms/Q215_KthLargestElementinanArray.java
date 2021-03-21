/**
 * @author holten
 * @date 2021/3/21
 */

class Q215_KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 3;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Heap heap = new Heap(k);
        for (int num : nums) {
            heap.add(num);
        }
        return heap.getMin();
    }

    static class Heap {
        private int[] heap;
        private int size;
        private int count;

        public Heap(int size) {
            this.size = size;
            this.count = 0;
            heap = new int[size + 1];
        }

        public void add(int n) {
            int index;
            if (count >= size) {
                if (n < heap[1]) {
                    return;
                }
                index = 1;
                heap[index] = n;
                while (true) {
                    int minIndex = index;
                    if (2 * index <= size && heap[2 * index] < heap[index]) {
                        minIndex = 2 * index;
                    }
                    if (2 * index + 1 <= size && heap[2 * index + 1] < heap[minIndex]) {
                        minIndex = 2 * index + 1;
                    }
                    if (index == minIndex) {
                        break;
                    }
                    swap(index, minIndex);
                    index = minIndex;
                }
            } else {
                index = count + 1;
                heap[index] = n;
                while (index > 1) {
                    if (heap[index] < heap[index / 2]) {
                        swap(index, index / 2);
                    }
                    index /= 2;
                }
                count++;
            }
        }

        public int getMin() {
            return heap[1];
        }

        private void swap(int a, int b) {
            int temp = heap[a];
            heap[a] = heap[b];
            heap[b] = temp;
        }
    }
}