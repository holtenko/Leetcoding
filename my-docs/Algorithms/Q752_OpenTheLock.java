import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by holten on 2018-02-12.
 * Email: holten.ko@foxmail.com
 */

class Q752_OpenTheLock {
    public static void main(String[] args) {
        Q752_OpenTheLock q752OpenTheLock = new Q752_OpenTheLock();
        String[] deadEnds = {"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        String target = "8888";
        System.out.println(q752OpenTheLock.openLock(deadEnds, target));
    }


    public int openLock(String[] deadEnds, String target) {
        Set<String> deadEndsSet = new HashSet<>(Arrays.asList(deadEnds));
        Set<String> visited = new HashSet<>();
        String start = "0000";
        Queue<String> queue = new LinkedBlockingQueue<>();
        queue.offer(start);
        visited.add(start);

        int step = 0;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                String current = queue.poll();
                if (deadEndsSet.contains(current)) {
                    continue;
                }
                if (target.equals(current)) {
                    return step;
                }
                for (int index = 0; index < 4; index++) {
                    String up = up(current, index);
                    String down = down(current, index);
                    if (!visited.contains(up)) {
                        queue.offer(up);
                        visited.add(up);
                    }
                    if (!visited.contains(down)) {
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    public String up(String code, int index) {
        char[] codeChars = code.toCharArray();
        codeChars[index] = codeChars[index] == '9' ? '0' : (char) (codeChars[index] + 1);
        return new String(codeChars);
    }

    public String down(String code, int index) {
        char[] codeChars = code.toCharArray();
        codeChars[index] = codeChars[index] == '0' ? '9' : (char) (codeChars[index] - 1);
        return new String(codeChars);
    }
}