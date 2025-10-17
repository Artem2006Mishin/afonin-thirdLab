package src;

import java.util.ArrayList;
import java.util.Comparator;

public class League {
  private ArrayList<FootballTeam> league;

  public League () {
    this.league = new ArrayList<>();
  }

  public void addTeam (FootballTeam team) {
    this.league.add(team);
  }

  public FootballTeam findChampionTeam () {
    return league.stream()
      .max(Comparator.comparingInt(team -> team.getWins()))
      .orElse(null);
  }

  public long findAboveAverageTeam () {
    double averageWins = league.stream()
      .mapToInt(team -> team.getWins())
      .average().orElse(0);

    return league.stream()
      .filter(team -> team.getWins() > averageWins).count();
  }

  // public ArrayList<FootballTeam> sortTeamDescending () {
  //   return league.stream()
  //     .sorted(Comparator.comparingInt(team -> team.getWins()).reversed())
  //     .toList(); 
  // }

}
