import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author holten
 * @date 2021/3/9
 */
class Q735_AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {-2,-1,1,2};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> aliveAsteroid = new LinkedList<>();

        LinkedList<Integer> rightAsteroid = new LinkedList<>();
        LinkedList<Integer> leftAsteroid = new LinkedList<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                if (!leftAsteroid.isEmpty()) {
                    collision(rightAsteroid, leftAsteroid, aliveAsteroid);
                }
                rightAsteroid.addFirst(asteroid);
            } else {
                leftAsteroid.addLast(asteroid);
            }
        }
        LinkedList<Integer> rightAliveAsteroid = collision(rightAsteroid, leftAsteroid, aliveAsteroid);
        while (rightAliveAsteroid != null && !rightAliveAsteroid.isEmpty()) {
            aliveAsteroid.add(rightAliveAsteroid.getLast());
            rightAliveAsteroid.removeLast();
        }
        int[] alive = new int[aliveAsteroid.size()];
        for (int i = 0; i < alive.length; i++) {
            alive[i] = aliveAsteroid.poll();
        }
        return alive;
    }

    private static LinkedList<Integer> collision(LinkedList<Integer> rightAsteroid, LinkedList<Integer> leftAsteroid, LinkedList<Integer> aliveAsteroid) {
        while (!rightAsteroid.isEmpty() && !leftAsteroid.isEmpty()) {
            int right = rightAsteroid.poll();
            int left = leftAsteroid.poll();
            int alive = right + left;
            if (alive > 0) {
                rightAsteroid.addFirst(right);
            }
            if (alive < 0) {
                leftAsteroid.addFirst(left);
            }
        }
        if (rightAsteroid.isEmpty()) {
            while (!leftAsteroid.isEmpty()) {
                aliveAsteroid.add(leftAsteroid.poll());
            }
            return null;
        } else {
            return rightAsteroid;
        }
    }
}