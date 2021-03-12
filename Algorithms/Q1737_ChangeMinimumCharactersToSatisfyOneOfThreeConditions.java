/**
 * @author holten
 * @date 2021/3/10
 */
class Q1737_ChangeMinimumCharactersToSatisfyOneOfThreeConditions {
    public static void main(String[] args) {
        String a = "a";
        String b = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        System.out.println(minCharacters(a, b));
    }

    public static int minCharacters(String a, String b) {
        int[] aCount = getCharCount(a);
        int[] bCount = getCharCount(b);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            int aTime = 0;
            int bTime = 0;
            int eqTime = 0;
            for (int j = 0; j < 26; j++) {
                if (j > i) {
                    aTime += aCount[j];
                    bTime += bCount[j];
                    eqTime = eqTime + aCount[j] + bCount[j];
                } else if (j < i) {
                    aTime += bCount[j];
                    bTime += aCount[j];
                    eqTime = eqTime + aCount[j] + bCount[j];
                } else {
                    aTime += aCount[j];
                    bTime += bCount[j];
                }
            }
            if (i > 0) {
                min = Math.min(min, aTime);
                min = Math.min(min, bTime);
            }
            min = Math.min(min, eqTime);
        }
        return min;
    }


    private static int[] getCharCount(String a) {
        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'a';
            count[index]++;
        }
        return count;
    }
}