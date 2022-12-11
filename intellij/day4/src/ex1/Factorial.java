package ex1;

public class Factorial {

    public static int recursionFactorial(int number) {
        if (number < 1)
            return 1;
        return number * recursionFactorial(number - 1);
    }


}
