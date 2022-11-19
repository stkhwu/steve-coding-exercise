package algo.day1;

public class Day1 {
  public static void main(String[] args) {
    int[] abc = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    int target = 6;

    for (int i = 0; i < abc.length; i++) {
      if (i == target) {
        System.out.println(i);
        break;
      }
    }

  }
}
