package questions.algoexpert.spiraltraverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTraverse {

    public static void main(String[] args) {

        spiralTraverse(new int[5][2]);
    }

    private static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        int n = array.length;
        int m = array[array.length - 1].length;
        int stepN = 0;
        int stepM = 0;

        if (n < m) {
            stepN = n;
            stepM = n;
        } else {
            stepN = m; // for 5 x 5 array, this is 5
            stepM = m - 1; // for 5 x 5 array, this is 4
        }
        // 5 -> 4 -> 3 -> 2 -> 1 (5 steps)
        // 5 -> 4 -> 3 -> 2 (4 steps)

        // initial steps
        return spiralTraverseHelper(array, stepN, stepM, 0, 0, 1, 0, ans);

        // 1 2 3 4 5
        // 2 1 2 3 6
        // 3 8 9 4 7
        // 4 7 6 5 8
        // 5 6 7 8 9

        // [0,0] [1,0] [2,0] [3,0] [4,0]
        // [0,1] [1,1] [2,1] [3,1] [4,1]
        // [0,2] [1,2] [2,2] [3,2] [4,2]
        // [0,3] [1,3] [2,3] [3,3] [4,3]
        // [0,4] [1,4] [2,4] [3,4] [4,4]
    }

    private static List<Integer> spiralTraverseHelper(int[][] array, int hStepsToRead, int vStepsToRead, int hCoordinate, int vCoordinate, int goingRight, int goingUp, List<Integer> target) {

        switch (goingRight) {
            case 1:
                for (int i = hCoordinate; i < hStepsToRead; i++) {
                        target.add(array[i][vCoordinate]);
                }
            case -1:
                for (int i = hCoordinate; i > hCoordinate - hStepsToRead; i--) {
                    target.add(array[i][vCoordinate]);
                }
            default:
        }


        return null;
    }
}
