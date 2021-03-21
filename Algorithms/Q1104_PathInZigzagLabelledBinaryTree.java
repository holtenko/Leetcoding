import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/21
 */
class Q1104_PathInZigzagLabelledBinaryTree {
    public static void main(String[] args) {
        int label = 7;
        System.out.println(pathInZigZagTree(label));
    }

    public static List<Integer> pathInZigZagTree(int label) {
        List<Integer> path = new ArrayList<>();
        int total = 1;
        int levelCount = 1;
        int level = 1;

        do {
            levelCount *= 2;
            total += levelCount;
            level++;
        } while (label > total);

        Stack<Integer> stack = new Stack<>();
        boolean isEven = level % 2 == 0;
        while (true) {
            stack.add(label);
            if (label == 1) {
                break;
            }
            int pair = ((label - levelCount) / 2) + 1;
            if (isEven) {
                label = levelCount - pair;
                isEven = false;
            } else {
                label = levelCount - pair;
                isEven = true;
            }
            levelCount /= 2;
        }
        while (!stack.isEmpty()) {
            path.add(stack.pop());
        }
        return path;
    }
}