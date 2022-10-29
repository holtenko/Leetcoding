
/**
 * @author holten
 * @date 2021/3/8
 */
class QInterview10_05_SparseArraySearchLCCI {
    public static void main(String[] args) {
        String[] words = {"DirNnILhARNS hOYIFB", "SM ", "YSPBaovrZBS", "evMMBOf", "mCrS", "oRJfjw gwuo", "xOpSEXvfI"};
        String s = "mCrS";
        System.out.println(findString(words, s));
    }

    public static int findString(String[] words, String s) {
        int start = 0;
        int end = words.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (s.equals(words[mid])) {
                return mid;
            } else if ("".equals(words[mid])) {
                boolean isEnd = true;
                while (mid <= end) {
                    if (!"".equals(words[mid])) {
                        int compare = s.compareTo(words[mid]);
                        if (compare > 0) {
                            start = mid + 1;
                        } else if (compare < 0) {
                            end = mid - 1;
                        } else {
                            return mid;
                        }
                        isEnd = false;
                        break;
                    } else {
                        mid++;
                    }
                }
                if (isEnd) {
                    end = start + (end - start) / 2 - 1;
                }
            } else {
                if (s.compareTo(words[mid]) > 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}