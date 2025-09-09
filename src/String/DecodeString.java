package String;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder s = new StringBuilder();
        String str = "1[b]";
        Stack<Character> stk = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int c = ch - '0';
                stk2.push(c);
            }
            else if (ch == '[' || Character.isAlphabetic(ch)) {
                stk.push(ch);
            }
            else {
                sb.setLength(0);
                while (stk.peek() != '[') {
                    sb.insert(0, stk.pop());
                }
                stk.pop();
                String expanded = count(sb, stk2);
                for (char c : expanded.toCharArray())
                {
                    stk.push(c);
                }
            }
        }

        while (!stk.isEmpty()) {
            s.insert(0, stk.pop());
        }
        System.out.println(s.toString());
    }

    private static String count(StringBuilder sb, Stack<Integer> stk2) {
        int len = stk2.pop();
        String part = sb.toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            result.append(part);
        }
        return result.toString();
    }
}
