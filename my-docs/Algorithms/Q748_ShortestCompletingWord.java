import java.math.BigInteger;
import java.util.HashMap;

/**
 * @author holten
 * @email holten.ko@gmail.com
 * @date 2021-02-27
 */
class Q748_ShortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "GrC8950";
        String[] words = {"measure", "other", "every", "base", "according", "level", "meeting", "none", "marriage", "rest"};
        System.out.println(shortestCompletingWord(licensePlate, words));
        System.out.println(shortestCompletingWordWitPrime(licensePlate, words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> licensePlateCharCountMap = getCharCountMap(licensePlate);
        String completeWord = null;
        for (String word : words) {
            boolean isComplete = true;
            HashMap<Character, Integer> wordCharCountMap = getCharCountMap(word);
            for (Character character : licensePlateCharCountMap.keySet()) {
                if (wordCharCountMap.getOrDefault(character, 0) < licensePlateCharCountMap.get(character)) {
                    isComplete = false;
                    break;
                }
            }
            if (isComplete && (completeWord == null || word.length() < completeWord.length())) {
                completeWord = word;
            }
        }
        return completeWord;
    }

    public static HashMap<Character, Integer> getCharCountMap(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            char lowcaseChar = 0;
            if (c >= 65 && c <= 90) {
                lowcaseChar = (char) (c + 32);
            }
            if (c >= 97 && c <= 122) {
                lowcaseChar = c;
            }
            if (lowcaseChar > 0) {
                charCountMap.put(lowcaseChar, charCountMap.getOrDefault(lowcaseChar, 0) + 1);
            }
        }
        return charCountMap;
    }


    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
    final static String[] primesString = {"2", "3", "5", "7", "11", "13", "17", "19", "23", "29", "31", "37", "41", "43", "47", "53", "59", "61", "67", "71", "73", "79", "83", "89", "97", "101", "103"};

    public static String shortestCompletingWordWitPrime(String licensePlate, String[] words) {
        BigInteger licensePlateNumber = getNumber(licensePlate);
        String shortestWord = null;
        for (String word : words) {
            BigInteger wordNumber = getNumber(word);
            if (wordNumber.remainder(licensePlateNumber).intValue() == 0) {
                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
        }
        return shortestWord;
    }

    public static BigInteger getNumber(String str) {
        BigInteger bigInteger = BigInteger.ONE;
        for (char c : str.toLowerCase().toCharArray()) {
            int index = c - 'a';
            if (index >= 0 && index <= 25) {
                bigInteger = bigInteger.multiply(new BigInteger(primesString[index]));
            }
        }
        return bigInteger;
    }
}