package questions.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1 {

    public static String solution(String str) {
        List<Character> c = new ArrayList<>();
        List<Character> d = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            c.add(str.charAt(i));
            d.add(str.charAt(i));
        }

        Collections.sort(c);
        char remove = c.get(str.length()-1);
        int idx = str.lastIndexOf(remove);
        d.remove(idx);

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < d.size(); i++) {
            s.append(d.get(i));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("codility"));
    }
}
