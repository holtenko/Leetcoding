import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/4/24
 */
class Q93_RestoreIPAddresses {
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtrack(s, 0, path, result);
        return result;
    }

    private static void backtrack(String s, int startIndex, List<String> path, List<String> result) {
        int pathSize = path.size();
        if (pathSize > 4) {
            return;
        }
        if (pathSize >= 4 && startIndex != s.length()) {
            return;
        }
        if (pathSize == 4) {
            result.add(pathToIP(path));
        }

        for (int i = startIndex; i < s.length(); i++) {
            String newStr = s.substring(startIndex, i + 1);
            if ((newStr.length() > 1 && newStr.startsWith("0")) || newStr.length() > 3) {
                continue;
            }
            int ip = Integer.parseInt(newStr);
            if (ip < 0 || ip > 255) {
                continue;
            }
            path.add(newStr);
            backtrack(s, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }

    private static String pathToIP(List<String> path) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String ip : path) {
            stringBuilder.append(ip);
            stringBuilder.append(".");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}