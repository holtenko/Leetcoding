import java.util.*;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q56_MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {4,5}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        PriorityQueue<int[]> sortedIntervals = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        sortedIntervals.addAll(Arrays.asList(intervals));

        List<int[]> resultList = new ArrayList<>();
        int[] merged = sortedIntervals.poll();
        while (!sortedIntervals.isEmpty()) {
            int[] interval = sortedIntervals.poll();
            int start = interval[0];
            int end = interval[1];
            if (start > merged[1]) {
                resultList.add(merged);
                merged = interval;
            } else {
                if (end > merged[1]) {
                    merged[1] = end;
                }
            }
        }
        resultList.add(merged);
        int[][] result = new int[resultList.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}