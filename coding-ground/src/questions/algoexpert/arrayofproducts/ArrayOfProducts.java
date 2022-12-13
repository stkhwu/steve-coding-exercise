package questions.algoexpert.arrayofproducts;

import java.util.Arrays;

public class ArrayOfProducts {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfProducts(new int[]{4, 2, 8, 3, 5, 6}))); // 1440, 2880, 720, 1920, 1152, 960
    }


    public static int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int length = array.length;
        int[] output = new int[length];
        int[] left = new int[length - 1];
        int[] right = new int[length - 1];
        int l = 1;
        int r = 1;
        for (int i = 0; i < length - 1; i++) {
            l *= array[i];
            left[i] = l;
        }
        System.out.println(Arrays.toString(left));

        for (int i = right.length - 1; i > -1; i--) {
            r *= array[i + 1];
            right[i] = r;
        }
        System.out.println(Arrays.toString(right));

        output[0] = right[0];
        output[length - 1] = left[length - 2];

        for (int i = 1; i < length - 1; i++) {
            output[i] = left[i - 1] * right[i];
        }

        return output;
    }
}
