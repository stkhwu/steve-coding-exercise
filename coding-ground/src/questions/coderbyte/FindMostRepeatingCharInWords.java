package questions.coderbyte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMostRepeatingCharInWords {


    public static void main(String[] args) {
        System.out.println(searching("Hello I am fine"));
        System.out.println(searching("Hello I am fine aa"));
    }

    static String searching(String str) {
        String[] words = str.replaceAll("[!,?._'@]", " ").replaceAll(" +", " ").trim().split(" ");
        List<Integer> scores = new ArrayList<>();
        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>();
            int score = 0;
            for (int i = 0; i < word.length(); i++) {
                map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    score += entry.getValue();
                }
            }
            scores.add(score);
        }
        String ans = "";
        int max = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > max){
                max = scores.get(i);
                ans = words[i];
            }
        }

        return !ans.isEmpty() ? ans : "-1";
    }
}
