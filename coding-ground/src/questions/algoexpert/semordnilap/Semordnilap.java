package questions.algoexpert.semordnilap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Semordnilap {
    public static void main(String[] args) {
        System.out.println();
    }

    public static ArrayList<ArrayList<String>> semordnilap(String[] words) {
        // Write your code here.
        List<String> temp = new ArrayList<>(Arrays.asList(words));
        ArrayList<ArrayList<String>> anss = new ArrayList<>();
        for (String word : words) {
            if(word.equals(reverseWord(word))){
                temp.remove(word);
            }
            if (temp.contains(reverseWord(word))){
                ArrayList<String> ans = new ArrayList<>();
                ans.add(word);
                ans.add(reverseWord(word));
                temp.remove(word);
                if (!anss.contains(ans)){
                anss.add(ans);}
            }
        }
        return anss;
    }

    private static String reverseWord(String word) {
        if (word.length() < 1) return "";
        return reverseWord(word.substring(1, word.length())) + word.charAt(0);
    }
}
