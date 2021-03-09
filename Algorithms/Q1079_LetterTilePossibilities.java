import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author holten
 * @date 2021/3/8
 */
class Q1079_LetterTilePossibilities {
    public static void main(String[] args) {
        String tiles = "AAB";
        System.out.println(numTilePossibilities(tiles));
    }

    private static int count = 0;

    public static int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);
        boolean[] visited = new boolean[chars.length];
        backtrack(chars, visited, 0);
        return count;
    }

    public static void backtrack(char[] tiles, boolean[] visited, int pos) {
        if (pos >= tiles.length) {
            return;
        }
        for (int i = 0; i < tiles.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (i > 0 && tiles[i] == tiles[i - 1] && !visited[i - 1]) {
                continue;
            }
            count++;
            visited[i] = true;
            backtrack(tiles, visited, pos + 1);
            visited[i] = false;
        }
    }
}