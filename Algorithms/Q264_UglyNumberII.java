import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author holten
 * @date 2021/4/11
 */
class Q264_UglyNumberII {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1));
    }

    public static int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();
        Heap heap = new Heap();
        heap.add(1);
        long result = 0;
        for (int i = 0; i < n; i++) {
            result = heap.get();
            long n2 = 2 * result;
            long n3 = 3 * result;
            long n5 = 5 * result;
            if (!set.contains(n2)) {
                set.add(n2);
                heap.add(n2);
            }
            if (!set.contains(n3)) {
                set.add(n3);
                heap.add(n3);
            }
            if (!set.contains(n5)) {
                set.add(n5);
                heap.add(n5);
            }
        }
        return (int) result;
    }

    static class Heap {
        ArrayList<Long> heap;

        public Heap() {
            heap = new ArrayList<>();
            heap.add(0L);
        }

        public void add(long val) {
            heap.add(val);
            int index = heap.size() - 1;
            while (index > 1) {
                if (val < heap.get(index / 2)) {
                    swap(index, index / 2);
                    index = index / 2;
                } else {
                    break;
                }
            }
        }

        public Long get() {
            if (heap.size() <= 1) {
                return null;
            }
            long result = heap.get(1);
            int size = heap.size();
            heap.set(1, heap.get(size - 1));
            heap.remove(size - 1);
            size = heap.size();
            int index = 1;
            while (true) {
                int minIndex = index;
                if (2 * index < size && heap.get(index) > heap.get(2 * index)) {
                    minIndex = 2 * index;
                }
                if (2 * index + 1 < size && heap.get(minIndex) > heap.get(2 * index + 1)) {
                    minIndex = 2 * index + 1;
                }
                if (index == minIndex) {
                    break;
                }
                swap(index, minIndex);
                index = minIndex;
            }

            return result;
        }

        private void swap(int a, int b) {
            long temp = heap.get(a);
            heap.set(a, heap.get(b));
            heap.set(b, temp);
        }
    }
}