import java.util.LinkedList;
import java.util.Queue;

/**
 * @author holten
 * @date 2021/3/10
 */
class Q649_Dota2Senate {
    public static void main(String[] args) {
        String senate = "RDD";
        System.out.println(predictPartyVictory(senate));
    }

    public static String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();
        for (int i = 0; i < senate.length(); i++) {
            if ('R' == senate.charAt(i)) {
                radiantQueue.add(i);
            } else {
                direQueue.add(i);
            }
        }
        int count = senate.length();
        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            Integer radiant = radiantQueue.poll();
            Integer dire = direQueue.poll();
            if (radiant < dire) {
                radiantQueue.add(count++);
            } else {
                direQueue.add(count++);
            }
        }
        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }
}