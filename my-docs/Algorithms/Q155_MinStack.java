import java.util.Stack;

/**
 * @author holten
 * @date 2021/4/8
 */
class Q155_MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-1);
        minStack.top();
        minStack.getMin();
        minStack.push(1);
        minStack.top();
        minStack.getMin();
    }

    static class MinStack {
        Stack<Long> stack;
        long min;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<>();
        }

        public void push(int val) {
            if (stack.isEmpty()) {
                min = val;
            }
            long diff = val - min;
            stack.push(diff);
            if (diff < 0) {
                min = val;
            }
        }

        public void pop() {
            if (stack.isEmpty()) {
                return;
            }
            long val = stack.pop();
            if (val < 0) {
                min = min - val;
            }
        }

        public int top() {
            if (stack.isEmpty()) {
                return -1;
            }
            long val = stack.peek();
            if (val < 0) {
                return (int) min;
            } else {
                return (int) (min + val);
            }
        }

        public int getMin() {
            return (int) min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}