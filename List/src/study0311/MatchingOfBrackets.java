package study0311;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MatchingOfBrackets {
    public static boolean isValid(String s) {


        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            Character top = stack.pop();
            if (top == '(' && c == ')') {
                continue;
            }
            if (top == '[' && c == ']') {
                continue;
            }
            if (top == '{' && c == '}') {
                continue;
            }

            return false;
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(isValid("(])"));
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        int ret = q.peek();
        System.out.println(ret);
    }
}
