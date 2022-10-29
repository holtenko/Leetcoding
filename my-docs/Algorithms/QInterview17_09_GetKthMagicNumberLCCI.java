import java.util.*;

/**
 * @author holten
 * @date 2021/3/10
 */
class QInterview17_09_GetKthMagicNumberLCCI {
    public static void main(String[] args) {
        System.out.println(getKthMagicNumber(643));
        System.out.println(getKthMagicNumber3Point(643));
    }

    public static int getKthMagicNumber3Point(int k) {
        int[] nums = new int[k];
        nums[0] = 1;
        int cur = 0;
        int p3 = 0, p5 = 0, p7 = 0;
        while (true) {
            if (cur == k - 1) {
                return nums[k - 1];
            }
            int num3 = nums[p3] * 3;
            int num5 = nums[p5] * 5;
            int num7 = nums[p7] * 7;
            int min = num3;
            if (num5 < min) {
                min = num5;
            }
            if (num7 < min) {
                min = num7;
            }
            if (min == num3) {
                p3++;
            }
            if (min == num5) {
                p5++;
            }
            if (min == num7) {
                p7++;
            }
            nums[++cur] = min;
        }
    }

    public static int getKthMagicNumber(int k) {
        Heap heap = new Heap();
        heap.add(1);
        HashSet<Integer> nums = new HashSet<>();
        while (true) {
            int current = (int) heap.poll();
            if (!nums.contains(current)) {
                nums.add(current);
                heap.add(current * 3L);
                heap.add(current * 5L);
                heap.add(current * 7L);
            }
            if (nums.size() == k) {
                return current;
            }
        }
    }

    static class Heap {
        ArrayList<Long> heap;
        int size = 0;

        public Heap() {
            heap = new ArrayList<>();
            heap.add(-1L);
        }

        public void add(long num) {
            heap.add(num);
            int index = ++size;
            while (index > 0) {
                if (heap.get(index) < heap.get(index / 2)) {
                    swap(index, index / 2);
                }
                index = index / 2;
            }
        }

        public long poll() {
            long result = heap.get(1);
            swap(1, size);
            heap.remove(size);
            int index = 1;
            while (true) {
                int minIndex = index;
                if (2 * index < size && heap.get(minIndex) > heap.get(2 * index)) {
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
            size--;
            return result;
        }

        private void swap(int a, int b) {
            long temp = heap.get(a);
            heap.set(a, heap.get(b));
            heap.set(b, temp);
        }
    }
}