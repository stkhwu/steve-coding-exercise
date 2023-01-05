package questions.leetcode.validparentheses;

import java.util.Stack;

public class validparentheses {
    public static void main(String[] args) {

    }

    static boolean isValid(String s) {

        /*
        Using Stack
        3 stacks? 1 stack?
        logic: if input "()" -> correct because stack in '(' then ')'
        logic details:
        if input is ")}]" -> immediately pop out the stack and compare
        if the pop out item is "({["

        if the input is "({[" then keep stack

        i.e. 1 stack is enough.
         */
        Stack<Character> input = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            if(!Character.isLetterOrDigit(next)) {
                switch (next) {
                    case ')' -> { if (input.isEmpty() || input.pop() != '(') return false; }
                    case '}' -> { if (input.isEmpty() || input.pop() != '{') return false; }
                    case ']' -> { if (input.isEmpty() || input.pop() != '[') return false; }
                    default -> input.push(next);
                }
            }
        }
        return input.empty();
    }
}
