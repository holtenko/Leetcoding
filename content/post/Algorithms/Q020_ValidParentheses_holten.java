/**
* Created by holten on 2016-07-07.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        Stack<Character> tmp = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            if (now == '(' || now == '{' || now == '[') {
                tmp.push(now);
            } else {
                if(tmp.isEmpty()) return false;
                switch (now) {
                    case ')':if (tmp.pop() != '(') return false; break;
                    case '}':if (tmp.pop() != '{') return false; break;
                    case ']':if (tmp.pop() != '[') return false; break;
                    default: return false;
                }
            }
        }
        return tmp.isEmpty();
    }
}