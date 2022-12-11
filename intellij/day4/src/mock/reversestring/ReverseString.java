package mock.reversestring;

public class ReverseString {


    public static String reverse(String s) {
        if (s.length() < 2)
            return s;
        return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
}
