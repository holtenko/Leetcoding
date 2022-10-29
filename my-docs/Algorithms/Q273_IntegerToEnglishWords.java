import java.util.Stack;

public class Q273_IntegerToEnglishWords {
    public static void main(String[] args) {
        int num = 100001;
        System.out.println("[" + numberToWords(num) + "]");
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String[] bit = {"", " Thousand", " Million", " Billion"};
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            int cur = num % 1000;
            stack.push(cur);
            num /= 1000;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int bitIndex = stack.size() - 1;
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (cur == 0) {
                bitIndex--;
            } else if (cur < 10) {
                stringBuilder.append(one(cur));
                stringBuilder.append(bit[bitIndex--]);
            } else if (cur < 20) {
                stringBuilder.append(twoLessThan20(cur));
                stringBuilder.append(bit[bitIndex--]);
            } else if (cur < 100) {
                stringBuilder.append(twoGreaterAndEqual20(cur));
                stringBuilder.append(bit[bitIndex--]);
            } else {
                stringBuilder.append(three(cur));
                stringBuilder.append(bit[bitIndex--]);
            }
            if (cur != 0 && !stack.isEmpty()) {
                stringBuilder.append(" ");
            }
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == ' ') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public static String one(int num) {
        switch (num) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "";
        }
    }

    public static String twoLessThan20(int num) {
        switch (num) {
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            default:
                return "";
        }
    }

    public static String twoGreaterAndEqual20(int num) {
        int low = num % 10;
        if (low == 0) {
            return ten(num / 10);
        } else {
            return ten(num / 10) + " " + one(num % 10);
        }
    }

    public static String three(int num) {
        int low = num % 100;
        if (low == 0) {
            return one(num / 100) + " Hundred";
        } else if (low < 10) {
            return one(num / 100) + " Hundred " + one(num % 100);
        } else if (low < 20) {
            return one(num / 100) + " Hundred " + twoLessThan20(num % 100);
        } else {
            return one(num / 100) + " Hundred " + twoGreaterAndEqual20(num % 100);
        }
    }

    public static String ten(int num) {
        switch (num) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
            default:
                return "";
        }
    }
}