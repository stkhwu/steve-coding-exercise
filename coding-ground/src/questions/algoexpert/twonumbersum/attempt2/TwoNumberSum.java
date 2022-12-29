package questions.algoexpert.twonumbersum.attempt2;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(answer(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10)));
    }

    static int[] answer(int[] array, int targetSum) {
        Set<Integer> visitedSet = new HashSet<>();
        for (int num : array) {
            int ans = targetSum - num;
            if (visitedSet.contains(ans)){
                return new int[]{ans, num};
            }
            visitedSet.add(num);
        }
        return new int[0];
    }
}
