import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Q870_AdvantageShuffle {
    public static void main(String[] args) {
        int[] A = {12, 24, 8, 32};
        int[] B = {13, 25, 32, 11};
        System.out.println(Arrays.toString(advantageCount(A, B)));
    }

    public static int[] advantageCount(int[] A, int[] B) {
        Map<Integer, Queue<Integer>> bIndexMap = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            int cur = B[i];
            if (bIndexMap.containsKey(cur)) {
                bIndexMap.get(cur).add(i);
            } else {
                Queue<Integer> indexQueue = new LinkedList<>();
                indexQueue.add(i);
                bIndexMap.put(cur, indexQueue);
            }
        }

        PriorityQueue<Integer> aRemain = new PriorityQueue<>();
        PriorityQueue<Integer> bRemain = new PriorityQueue<>();
        for (int i = 0; i < A.length; i++) {
            aRemain.add(A[i]);
            bRemain.add(B[i]);
        }

        Queue<Integer> aAbandon = new LinkedList<>();
        Set<Integer> bAssign = new HashSet<>();

        int[] result = new int[A.length];
        while (!aRemain.isEmpty()) {
            int bCur = bRemain.peek();
            int minA = aRemain.poll();
            if (minA > bCur) {
                int bCurIndex = bIndexMap.get(bCur).poll();
                result[bCurIndex] = minA;
                bAssign.add(bCurIndex);
                bRemain.poll();
            } else {
                aAbandon.add(minA);
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (!bAssign.contains(i)) {
                result[i] = aAbandon.poll();
            }
        }
        return result;
    }
}