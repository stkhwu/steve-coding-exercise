package exercise;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

    public static int firstNonRepeatingChar(String target) {
        for (int i = 0; i < target.length(); i++) {
            if (target.indexOf(target.charAt(i)) == target.lastIndexOf(target.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int firstNonRepeating(String target) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            map.put(target.charAt(i), map.getOrDefault(target.charAt(i), 0) + 1);
        }
        for (int i = 0; i < target.length(); i++) {
            if (map.get(target.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
