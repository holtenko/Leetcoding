/**
 * @author holten
 * @date 2021/3/7
 */
class Q1334_FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        int distanceThreshold = 4;
        System.out.println(findTheCity(n, edges, distanceThreshold));
        System.out.println(dijkstra(n, edges, distanceThreshold));
    }

    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        return floyd(n, edges, distanceThreshold);
    }

    private static int floyd(int n, int[][] edges, int distanceThreshold) {
        int[][] dis = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dis[i][j] = 0;
                } else {
                    dis[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int[] edge : edges) {
            dis[edge[0]][edge[1]] = edge[2];
            dis[edge[1]][edge[0]] = edge[2];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && i != k && j != k && dis[i][k] < Integer.MAX_VALUE && dis[k][j] < Integer.MAX_VALUE) {
                        if (dis[i][j] == Integer.MAX_VALUE || dis[i][j] > dis[i][k] + dis[k][j]) {
                            dis[i][j] = dis[i][k] + dis[k][j];
                        }
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int city = 0;
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int d : dis[i]) {
                if (d > 0 && d <= distanceThreshold) {
                    cur++;
                }
            }
            if (cur <= min) {
                min = cur;
                city = i;
            }
        }
        return city;
    }

    private static int dijkstra(int n, int[][] edges, int distanceThreshold) {
        int[][] dis = new int[n][n];
        for (int i = 0; i < n; i++) {
            dis[i] = dijkstra(i, n, edges);
        }
        int min = Integer.MAX_VALUE;
        int city = 0;
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int d : dis[i]) {
                if (d > 0 && d <= distanceThreshold) {
                    cur++;
                }
            }
            if (cur <= min) {
                min = cur;
                city = i;
            }
        }
        return city;
    }

    private static int[] dijkstra(int start, int n, int[][] edges) {
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = edge[2];
            graph[edge[1]][edge[0]] = edge[2];
        }

        int[] dis = new int[n];
        for (int i = 0; i < n; i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        boolean[] visited = new boolean[n];
        dis[start] = 0;
        while (true) {
            int current = -1;
            int currentDis = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (!visited[i] && dis[i] < currentDis) {
                    current = i;
                    currentDis = dis[i];
                }
            }
            if (current < 0) {
                break;
            }
            visited[current] = true;
            for (int i = 0; i < n; i++) {
                if (i == current || graph[current][i] == Integer.MAX_VALUE) {
                    continue;
                }
                if (dis[i] > graph[current][i] + currentDis) {
                    dis[i] = graph[current][i] + currentDis;
                }
            }
        }
        return dis;
    }
}