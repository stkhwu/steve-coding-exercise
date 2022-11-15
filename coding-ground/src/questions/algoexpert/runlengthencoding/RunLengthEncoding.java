package questions.algoexpert.runlengthencoding;

public class RunLengthEncoding {

  public String runLengthEncoding(String string) {
    // Write your code here.
    String ans = "";
    int counter = 0;

    for (int i = 0; i < string.length(); i++) {
      counter++;
      if (i == string.length() - 1 || string.charAt(i) != string.charAt(i + 1) || counter == 9) {
        ans = ans + counter + string.charAt(i);
        counter = 0;
      }
    }

    return ans;
  }
}
