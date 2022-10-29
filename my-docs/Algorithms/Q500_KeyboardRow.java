import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * @author holten
 * @date 2021/3/10
 */
class Q500_KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        int[] charRow = new int[26];
        for (char c : "qwertyuiop".toCharArray()) {
            charRow[c - 'a'] = 1;
        }
        for (char c : "asdfghjkl".toCharArray()) {
            charRow[c - 'a'] = 2;
        }
        for (char c : "zxcvbnm".toCharArray()) {
            charRow[c - 'a'] = 3;
        }
        int count = words.length;
        for (int j = 0; j < words.length; j++) {
            int preRow = -1;
            String word = words[j].toLowerCase(Locale.ROOT);
            for (int i = 0; i < word.length(); i++) {
                int curRow = charRow[word.charAt(i) - 'a'];
                if (preRow == -1) {
                    preRow = curRow;
                } else {
                    if (curRow != preRow) {
                        words[j] = null;
                        count--;
                        break;
                    }
                }
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (String word : words) {
            if (word != null) {
                result[index++] = word;
            }
        }
        return result;
    }
}