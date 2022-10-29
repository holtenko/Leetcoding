import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/21
 */
class QInterview_16_20_T9 {
    public static void main(String[] args) {
        String num = "2";
        String[] words = {"a", "b", "c", "d"};
        System.out.println(getValidT9Words(num, words));
    }

    public static List<String> getValidT9Words(String num, String[] words) {
        char[] charNum = {'2', '2', '2', '3', '3', '3', '4', '4', '4', '5', '5', '5', '6', '6', '6',
                '7', '7', '7', '7', '8', '8', '8', '9', '9', '9', '9'};
        List<String> result = new ArrayList<>();
        for (String word : words) {
            boolean isMatch = true;
            for (int i = 0; i < word.length(); i++) {
                if (charNum[word.charAt(i) - 'a'] != num.charAt(i)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                result.add(word);
            }
        }
        return result;
    }
}