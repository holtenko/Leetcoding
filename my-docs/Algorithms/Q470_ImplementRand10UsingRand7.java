/**
 * @author holten
 * @date 2020-12-14
 * Email: holten.ko@gmail.com
 */

public class Q470_ImplementRand10UsingRand7 {

    public static void main(String[] args) {
        System.out.println(rand10());
    }

    public static int rand10() {
        while (true) {
            int num = (rand7() - 1) * 7 + rand7();
            if (num <= 40) {
                return num % 10 + 1;
            }
        }
    }

    public static int rand7() {
        return 1;
    }
}