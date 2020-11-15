/**
 * Created by holten on 2019-09-06.
 * Email: holten.ko@foxmail.com
 */

class Q1108_DefangingAnIPAddress_holten {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public String defangIPaddr1(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}