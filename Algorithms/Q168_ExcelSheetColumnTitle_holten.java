/**
* Created by holten on 2016-07-19.
* Email: holten.ko@gmail.com
*/

public class Q168_ExcelSheetColumnTitle_holten {
    public String convertToTitle(int n) {
        if (n <= 26) return (char)('A' + n - 1) + "";
        if (n % 26 != 0) return convertToTitle((n / 26)) + (char)('A' + (n % 26) - 1);
        else return convertToTitle((n / 26) - 1) + "Z";
    }
}