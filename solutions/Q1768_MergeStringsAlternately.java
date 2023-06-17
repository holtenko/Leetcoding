class Solution {
    public static void main(String[] args) {
        String word1 = "1357";
        String word2 = "24";
        String mergedString = mergeAlternately(word1, word2);
        System.out.println(mergedString);
    }

    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int pos = 0;

        StringBuilder builder = new StringBuilder();
        while (pos < len1 && pos < len2) {
            builder.append(word1.charAt(pos));
            builder.append(word2.charAt(pos));
            pos++;
        }

        if (pos >= len1) {
            builder.append(word2, pos, len2);
        } else {
            builder.append(word1, pos, len1);
        }

        return builder.toString();
    }
}