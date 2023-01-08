package questions.leetcode.isomorphicstrings;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> stMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (stMap.containsKey(s.charAt(i))) {
                if (stMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                stMap.put(s.charAt(i), t.charAt(i));
            }
        }
        stMap.clear();
        for (int i = 0; i < s.length(); i++) {
            if (stMap.containsKey(t.charAt(i))) {
                if (stMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                stMap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
