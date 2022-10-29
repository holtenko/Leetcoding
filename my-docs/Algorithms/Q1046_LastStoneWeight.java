import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/8
 */
class Q1046_LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        Heap heap = new Heap(stones);
        while (heap.isNotEmpty()) {
            int max = heap.poll();
            int secondMax = heap.poll();
            if (secondMax < 0) {
                return max;
            }
            int diff = max - secondMax;
            if (diff > 0) {
                heap.add(diff);
            }
        }
        return 0;
    }

    static class Heap {
        private int[] heap;
        private int count = 0;

        public Heap(int[] array) {
            this.heap = new int[array.length + 1];
            for (int i : array) {
                add(i);
            }
        }

        public void add(int element) {
            int index = ++count;
            heap[index] = element;
            while (index > 1 && heap[index] > heap[index / 2]) {
                swap(index, index / 2);
                index = index / 2;
            }
        }

        public int poll() {
            if (count <= 0) {
                return -1;
            }
            int max = heap[1];
            heap[1] = heap[count];
            int index = 1;
            while (true) {
                int maxIndex = index;
                if (2 * index <= count && heap[index] < heap[2 * index]) {
                    maxIndex = 2 * index;
                }
                if (2 * index + 1 <= count && heap[maxIndex] < heap[2 * index + 1]) {
                    maxIndex = 2 * index + 1;
                }
                if (maxIndex == index) {
                    break;
                }
                swap(index, maxIndex);
                index = maxIndex;
            }
            count--;
            return max;
        }

        public boolean isNotEmpty() {
            return count > 0;
        }

        private void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }
    }
}