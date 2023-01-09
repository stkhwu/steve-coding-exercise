package questions.leetcode.issubsequence.PointerAttempt;

public class IsSubsequence {

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(s.substring(0,1));
    }

    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        if (s.length() == 0) return true;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)){
                sPointer++;
                tPointer++;
                if (sPointer >= s.length()) {
                    return true;
                }
            } else {
                tPointer++;
            }
        }
        return false;
    }
}
