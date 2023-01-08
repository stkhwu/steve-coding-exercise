package questions.leetcode.issubsequence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        List<Character> sl = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            sl.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (!sl.isEmpty() && t.charAt(i) == sl.get(0)){
                sl.remove(sl.get(0));
            }
        }
        return sl.isEmpty();
    }
}
