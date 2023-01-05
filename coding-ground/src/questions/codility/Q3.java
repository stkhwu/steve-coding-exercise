package questions.codility;

public class Q3 {
    public static void solution(int n) {
        int enable_print = n % 10;
        while (n > 0) {
            if (enable_print == 0 && n % 10 != 0) {
                enable_print = 1;
            }
            else if (enable_print == 1) {
                System.out.print(n % 10);
            }
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        solution(10);
    }
}
