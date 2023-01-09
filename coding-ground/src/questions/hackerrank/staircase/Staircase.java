package questions.hackerrank.staircase;

public class Staircase {

    public static void main(String[] args) {
        staircase(4);
    }

    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i < n + 1; i++) {
            System.out.println(" ".repeat(n - i).concat("#".repeat(i)));
        }
    }
}
