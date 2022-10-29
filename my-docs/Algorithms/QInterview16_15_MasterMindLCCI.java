import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author holten
 * @date 2021/3/10
 */
class QInterview16_15_MasterMindLCCI {
    public static void main(String[] args) {
        String solution = "BGBG";
        String guess = "RGBR";
        System.out.println(Arrays.toString(masterMind(solution, guess)));
    }

    public static int[] masterMind(String solution, String guess) {
        int[] result = new int[2];
        Map<Character, Integer> solutionCount = new HashMap<>();
        Map<Character, Integer> guessCount = new HashMap<>();
        for (int i = 0; i < solution.length(); i++) {
            char solutionChar = solution.charAt(i);
            char guessChar = guess.charAt(i);
            solutionCount.put(solutionChar, solutionCount.getOrDefault(solutionChar, 0) + 1);
            guessCount.put(guessChar, guessCount.getOrDefault(guessChar, 0) + 1);
        }
        for (int i = 0; i < guess.length(); i++) {
            char guessChar = guess.charAt(i);
            if (solution.charAt(i) == guessChar) {
                result[0]++;
                if (solutionCount.get(guessChar) - 1 <= 0) {
                    solutionCount.remove(guessChar);
                } else {
                    solutionCount.put(guessChar, solutionCount.get(guessChar) - 1);
                }
                if (guessCount.get(guessChar) - 1 <= 0) {
                    guessCount.remove(guessChar);
                } else {
                    guessCount.put(guessChar, guessCount.get(guessChar) - 1);
                }
            }
        }
        for (Character guessChar : guessCount.keySet()) {
            if (solutionCount.containsKey(guessChar)) {
                result[1] = guessCount.get(guessChar) > solutionCount.get(guessChar) ? result[1] + solutionCount.get(guessChar) : result[1] + guessCount.get(guessChar);
                solutionCount.remove(guessChar);
            }
        }
        return result;
    }
}