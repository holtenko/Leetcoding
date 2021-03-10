/**
 * @author holten
 * @date 2021/3/10
 */
class Q641_DesignCircularDeque {
    public static void main(String[] args) {
        MyCircularDeque deque = new MyCircularDeque(3);
        boolean param_1 = deque.insertFront(1);
        boolean param_2 = deque.insertLast(2);
        boolean param_9 = deque.insertLast(3);
        boolean param_10 = deque.insertLast(5);
        boolean param_11 = deque.isFull();
        boolean param_3 = deque.deleteFront();
        boolean param_4 = deque.deleteLast();
        int param_5 = deque.getFront();
        int param_6 = deque.getRear();
        boolean param_7 = deque.isEmpty();
        boolean param_8 = deque.isFull();
    }

    static class MyCircularDeque {
        int[] queue;
        int size;
        int count;
        int headIndex;
        int tailIndex;

        /**
         * Initialize your data structure here. Set the size of the deque to be k.
         */
        public MyCircularDeque(int k) {
            queue = new int[k];
            size = k;
            headIndex = 0;
            tailIndex = 1;
        }

        /**
         * Adds an item at the front of Deque. Return true if the operation is successful.
         */
        public boolean insertFront(int value) {
            if (count >= size) {
                return false;
            }
            queue[headIndex] = value;
            headIndex = headIndex == 0 ? size - 1 : headIndex - 1;
            count++;
            return true;
        }

        /**
         * Adds an item at the rear of Deque. Return true if the operation is successful.
         */
        public boolean insertLast(int value) {
            if (count >= size) {
                return false;
            }
            queue[tailIndex] = value;
            tailIndex = tailIndex == size - 1 ? 0 : tailIndex + 1;
            count++;
            return true;
        }

        /**
         * Deletes an item from the front of Deque. Return true if the operation is successful.
         */
        public boolean deleteFront() {
            if (count <= 0) {
                return false;
            }
            if (headIndex == size - 1) {
                headIndex = 0;
            } else {
                headIndex++;
            }
            count--;
            return true;
        }

        /**
         * Deletes an item from the rear of Deque. Return true if the operation is successful.
         */
        public boolean deleteLast() {
            if (count <= 0) {
                return false;
            }
            if (tailIndex == 0) {
                tailIndex = size - 1;
            } else {
                tailIndex--;
            }
            count--;
            return true;
        }

        /**
         * Get the front item from the deque.
         */
        public int getFront() {
            if (count <= 0) {
                return -1;
            }
            return headIndex == size - 1 ? queue[0] : queue[headIndex + 1];
        }

        /**
         * Get the last item from the deque.
         */
        public int getRear() {
            if (count <= 0) {
                return -1;
            }
            return tailIndex == 0 ? queue[size - 1] : queue[tailIndex - 1];
        }

        /**
         * Checks whether the circular deque is empty or not.
         */
        public boolean isEmpty() {
            return count <= 0;
        }

        /**
         * Checks whether the circular deque is full or not.
         */
        public boolean isFull() {
            return count >= size;
        }
    }

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
}