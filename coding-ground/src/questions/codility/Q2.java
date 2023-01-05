package questions.codility;

import java.util.Arrays;
import java.util.Stack;

public class Q2 {

    public static boolean solution(int[] input){
        if (input.length % 2 != 0) return false;
        Arrays.sort(input);
        Stack<Integer> checker = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if(i % 2 == 0){
            checker.push(input[i]);}
            else if (checker.pop() != input[i]){
                return false;
            }
        }
        return true;
    }
    // 1,1,2,2

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,2,1}));
    }
}
