/**
 * @author holten
 * @date 2021/3/8
 */
class Q686_RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(repeatedStringMatch(a, b));
    }

    public static int repeatedStringMatch(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) != a.charAt((i + j) % a.length())) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                if ((i + b.length()) % a.length() > 0) {
                    return (i + b.length()) / a.length() + 1;
                } else {
                    return (i + b.length()) / a.length();
                }
            }
        }
        return -1;
    }
}