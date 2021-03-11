package study0311;

import java.util.Stack;

public class BackSpace {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            char s  = S.charAt(i);
            if(s != '#'){
                stack1.push(s);
                continue;
            }
            if(s == '#' && !stack1.isEmpty()){
                stack1.pop();
                continue;
            }


        }
        for(int i = 0; i < T.length(); i++){
            char t  = T.charAt(i);
            if(t != '#'){
                stack2.push(t);
                continue;
            }
            if(t == '#' && !stack2.isEmpty()){
                stack2.pop();
                continue;
            }
        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.peek() != stack2.peek()){
                return false;
            }
            stack1.pop();
            stack2.pop();

        }
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ab#c"));
    }
}
