import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/21
 */
class Q1560_MostVisitedSectorInACircularTrack {
    public static void main(String[] args) {
        int n = 7;
        int[] rounds = {1,3,5,7};
        System.out.println(mostVisited(n, rounds));
    }

    public static List<Integer> mostVisited(int n, int[] rounds) {
        int[] visitTimes = new int[n + 1];
        for (int i = 1; i < rounds.length; i++) {
            int start = rounds[i - 1];
            int end = rounds[i];
            int cur = start;
            while (cur != end) {
                visitTimes[cur]++;
                if (cur == n) {
                    cur = 1;
                } else {
                    cur++;
                }
            }
        }
        visitTimes[rounds[rounds.length - 1]]++;
        List<Integer> sectors = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int sector = 1; sector < visitTimes.length; sector++) {
            if (visitTimes[sector] > max) {
                sectors.clear();
                sectors.add(sector);
                max = visitTimes[sector];
            } else if (visitTimes[sector] == max) {
                sectors.add(sector);
            }
        }
        return sectors;
    }
}