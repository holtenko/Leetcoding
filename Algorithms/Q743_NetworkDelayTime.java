import java.util.*;

/**
 * @author holten
 * @email holten.ko@gmail.com
 * @date 2021-02-27
 */
class Q743_NetworkDelayTime {
    public static void main(String[] args) {
        int[][] times = {{1, 2, 1}, {2, 1, 3}};
        int n = 2;
        int k = 2;
        System.out.println(networkDelayTimeDfs(times, n, k));
        System.out.println(networkDelayTimeDijkstra(times, n, k));
    }

    private static void buildGraph(int[][] graphArray, Map<Integer, Map<Integer, Integer>> graph) {
        for (int[] edge : graphArray) {
            Integer fromNode = edge[0];
            Map<Integer, Integer> destNode = graph.get(fromNode);
            if (destNode == null) {
                destNode = new HashMap<>();
                destNode.put(edge[1], edge[2]);
                graph.put(fromNode, destNode);
            } else {
                destNode.put(edge[1], edge[2]);
            }
        }
    }

    private static int findMax(int[] dists) {
        int time = 0;
        for (int dist : dists) {
            if (dist == Integer.MAX_VALUE) {
                return -1;
            }
            if (dist > time) {
                time = dist;
            }
        }
        return time;
    }

    private static int findMax(Collection<Integer> dists) {
        int time = 0;
        for (int dist : dists) {
            if (dist == Integer.MAX_VALUE) {
                return -1;
            }
            if (dist > time) {
                time = dist;
            }
        }
        return time;
    }

    /**
     * -------------- 使用Dijkstra实现的 --------------
     **/
    public static int networkDelayTimeDijkstra(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[n + 1];
        Map<Integer, Integer> dists = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            dists.put(i, Integer.MAX_VALUE);
        }
        buildGraph(times, graph);
        dists.put(k, 0);
        while (true) {
            int currentNode = -1;
            int currentDis = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && dists.get(i) < currentDis) {
                    currentNode = i;
                    currentDis = dists.get(i);
                }
            }
            if (currentNode < 0) {
                break;
            }
            visited[currentNode] = true;
            if (graph.containsKey(currentNode)) {
                for (Integer nextNode : graph.get(currentNode).keySet()) {
                    if (graph.get(currentNode).get(nextNode) + currentDis < dists.get(nextNode)) {
                        dists.put(nextNode, graph.get(currentNode).get(nextNode) + currentDis);
                    }
                }
            }
        }
        int time = 0;
        for (int dist : dists.values()) {
            if (dist == Integer.MAX_VALUE) {
                return -1;
            }
            if (dist > time) {
                time = dist;
            }
        }
        return time;
    }

    /**
     * -------------- 使用DFS实现的 --------------
     **/
    public static int networkDelayTimeDfs(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        int[] dists = new int[n];
        for (int i = 0; i < n; i++) {
            dists[i] = Integer.MAX_VALUE;
        }
        buildGraph(times, graph);
        dfs(k, graph, dists, 0);
        return findMax(dists);
    }

    private static void dfs(int start, Map<Integer, Map<Integer, Integer>> graph, int[] dists, int currentDist) {
        int index = start - 1;
        if (currentDist >= dists[index]) {
            return;
        }
        dists[index] = currentDist;
        if (graph.containsKey(start)) {
            Map<Integer, Integer> nodes = graph.get(start);
            for (Integer next : nodes.keySet()) {
                dfs(next, graph, dists, currentDist + nodes.get(next));
            }
        }
    }
}