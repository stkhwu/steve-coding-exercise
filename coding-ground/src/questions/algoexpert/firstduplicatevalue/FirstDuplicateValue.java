package questions.algoexpert.firstduplicatevalue;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {
    public static void main(String[] args) {

    }


    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        Set<Integer> s = new HashSet<>();
        for (int i : array) {
            if (!s.add(i)) {
                return i;
            }
        }
        return -1;
    }
}
