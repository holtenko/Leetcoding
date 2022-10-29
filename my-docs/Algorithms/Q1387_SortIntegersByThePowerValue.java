import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q1387_SortIntegersByThePowerValue {
    public static void main(String[] args) {
        int lo = 10;
        int hi = 20;
        int k = 5;
        System.out.println(getKth(lo, hi, k));
    }

    public static int getKth(int lo, int hi, int k) {
        Map<Integer, Queue<Integer>> powerMap = new HashMap<>();
        for (int i = lo; i <= hi; i++) {
            int power = calPower(i);
            if (!powerMap.containsKey(power)) {
                powerMap.put(power, new LinkedList<>());
            }
            powerMap.get(power).add(i);
        }
        PriorityQueue<Integer> powerQueue = new PriorityQueue<>();
        for (Integer power : powerMap.keySet()) {
            powerQueue.add(power);
        }
        while (true) {
            Queue<Integer> q = powerMap.get(powerQueue.poll());
            while (!q.isEmpty()) {
                int cur = q.poll();
                if (--k == 0) {
                    return cur;
                }
            }
        }
    }

    private static int calPower(int num) {
        int step = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
            step++;
        }
        return step;
    }
}