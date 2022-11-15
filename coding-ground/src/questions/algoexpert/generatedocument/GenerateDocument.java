package questions.algoexpert.generatedocument;

import java.util.ArrayList;
import java.util.List;

public class GenerateDocument {
  public static void main(String[] args) {
    generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!");
  }

  public static boolean generateDocument(String characters, String document) {
    // Write your code here.
    List<String> charArray = new ArrayList<>();
    List<String> docArray = new ArrayList<>();

    for (int i = 0; i < characters.length(); i++) {
      charArray.add(characters.valueOf(characters.charAt(i)));
    }

    for (int i = 0; i < document.length(); i++) {
      docArray.add(document.valueOf(document.charAt(i)));
    }

    for (String a : docArray) {
      if (!charArray.remove(a)) {
        return false;
      }
    }

    return true;
  }
}
