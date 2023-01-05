package questions.leetcode.generateparenthese;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthese {
    static final String[] brackets = new String[] { "(", ")", "[", "]" };
    static final char[] bracketArray = new char[] { '(', ')' };

    // 1 < n < 10
    // ([ -> exception, return true
    // [) -> false,
    // (()) -> true
    // [ -> +1000, ] -> -1000

    public static List<String> generateAllStrings(int n) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n * 2; i++) { // loop n*2 times
            strings = concatNextChar(strings);
        }
        return strings;
    }

    public static boolean isValid(String s) {

        Stack<Character> input = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            switch (next) {
                case ')' -> {
                    if (input.isEmpty() || input.pop() != '(')
                        return false;
                }
                case '}' -> {
                    if (input.isEmpty() || input.pop() != '{')
                        return false;
                }
                case ']' -> {
                    if (input.isEmpty() || input.pop() != '[')
                        return false;
                }
                default -> input.push(next);
            }
        }
        return true;
    }

    public static boolean isBalance(String s) {
        long openCounter = 0;
        long closeCounter = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                openCounter++;
            if (c == ')' || c == ']' || c == '}')
                closeCounter++;
        }
        return openCounter == closeCounter;
    }

    // Recursive
    public static void concatString(Integer n, List<String> list, String str) {
        // !isValid, return -1, if str.length() == n*2, return list.add
        if (isValid(str)) {
            if (str.length() == n * 2) {
                // System.out.println(str.charAt(str.length() - 1));
                if (isBalance(str)) {
                    list.add(str);
                }
                return;
            }
            for (char c : bracketArray) {
                concatString(n, list, str + c);
            }
        }
    }

    public static List<String> concatNextChar(List<String> strings) {
        List<String> newStrings = new ArrayList<>();
        // (
        // ) -> false
        // [
        // ]
        for (String bracket : brackets) {
            if (strings.size() == 0) {
                newStrings.add(bracket);
            }
            for (String str : strings) {
                newStrings.add(str + bracket);
            }
        }
        return newStrings;
    }


    public static List<String> generateValidBrackets(Integer n, char[] brackets) {
        List<String> strings = new ArrayList<>();
        concatString(n, strings, new String());
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(generateValidBrackets(15, bracketArray).size());
    }
}
