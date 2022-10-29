import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/27
 */

class Q232_ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }

    static class MyQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        private boolean isPush;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
            isPush = false;
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            Stack<Integer> stack = stack1.isEmpty() ? stack2 : stack1;
            Stack<Integer> nextStack = stack1.isEmpty() ? stack1 : stack2;
            if (isPush) {
                stack.push(x);
            } else {
                while (!stack.isEmpty()) {
                    nextStack.push(stack.pop());
                }
                nextStack.push(x);
            }
            isPush = true;
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            Stack<Integer> stack = stack1.isEmpty() ? stack2 : stack1;
            Stack<Integer> nextStack = stack1.isEmpty() ? stack1 : stack2;
            if (isPush) {
                while (!stack.isEmpty()) {
                    nextStack.push(stack.pop());
                }
                isPush = false;
                return nextStack.pop();
            } else {
                isPush = false;
                return stack.pop();
            }
        }

        /**
         * Get the front element.
         */
        public int peek() {
            Stack<Integer> stack = stack1.isEmpty() ? stack2 : stack1;
            Stack<Integer> nextStack = stack1.isEmpty() ? stack1 : stack2;
            if (isPush) {
                while (!stack.isEmpty()) {
                    nextStack.push(stack.pop());
                }
                isPush = false;
                return nextStack.peek();
            } else {
                isPush = false;
                return stack.peek();
            }
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}