/**
 * @author holten
 * @date 2022/1/3
 */
public class Q1185_DayOfTheWeek {
    public static void main(String[] args) {
        int day = 29;
        int month = 2;
        int year = 2016;
        String weekDay = dayOfTheWeek(day, month, year);
        System.out.println(weekDay);
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int days = 0;
        // 1.计算 year 到 1971年 之间的天数
        for (int y = 1971; y < year; y++) {
            days += isLeap(y) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            days += getMonthDays(m, year);
        }
        days += day;
        int weekDay = (days + 4) % 7;
        return weekDays[weekDay];
    }

    private static boolean isLeap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static int getMonthDays(int month, int year) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = monthDays[month - 1];
        // 如果是2月且是闰年则需要多加1天
        return (month == 2 && isLeap(year)) ? days + 1 : days;
    }
}
