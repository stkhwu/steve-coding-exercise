package questions.algoexpert.tournamentwinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TournamentWinner {
  public static void main(String[] args) {
    TournamentWinner tournamentWinner = new TournamentWinner();
    ArrayList<Integer> results = new ArrayList<>();
    results.add(0);
    // results.add(0);
    // results.add(1);
    ArrayList<ArrayList<String>> competitions = new ArrayList<>();
    ArrayList<String> supcomp1 = new ArrayList<>();
    ArrayList<String> supcomp2 = new ArrayList<>();
    ArrayList<String> supcomp3 = new ArrayList<>();
    supcomp1.add("HTML");
    supcomp1.add("C#");
    // supcomp2.add("C#");
    // supcomp2.add("Python");
    // supcomp3.add("Python");
    // supcomp3.add("HTML");
    competitions.add(supcomp1);
    // competitions.add(supcomp2);
    // competitions.add(supcomp3);


  System.out.println(tournamentWinner.tournamentWinner(competitions, results));
}



  public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    Map<String, Integer> score = new HashMap<>();
    int resultPointer = 0;
      competitions.forEach(e -> e.forEach(r->score.put(r, 0)));
    

    System.out.println(score);
    for (ArrayList<String> comp : competitions) {
      if (results.get(resultPointer++) > 0) {
        score.put(comp.get(0), score.get(comp.get(0)) + 1);
      } else {
        score.put(comp.get(1), score.get(comp.get(1)) + 1);
      }
    }
    
    return score.entrySet().stream().max((x, y) -> x.getValue().compareTo(y.getValue())).get().getKey();
  }
}
