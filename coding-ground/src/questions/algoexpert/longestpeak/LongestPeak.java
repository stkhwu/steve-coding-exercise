package questions.algoexpert.longestpeak;

public class LongestPeak {
  public static void main(String[] args) {
    System.out.println(longestPeak(new int[] {1, 3, 2}));
  }

  private static int longestPeak(int[] array) {
    // Write your code here.
    if (array.length < 3) {
      return 0;
    }
    int upPt = 0;
    int peakPt = 0;
    int downPt = 0;
    int longestPeak = 3;

    return -1;
  }
}
