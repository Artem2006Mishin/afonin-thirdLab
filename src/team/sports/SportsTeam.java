package src.team.sports;

import src.team.FootballTeam;
import src.team.esports.GamePlatform;

public class SportsTeam extends FootballTeam {
  private Stadium stadium;
  
  public SportsTeam () {
    super();
    stadium = new Stadium();
  }

  public SportsTeam (String teamName, int wins, int capacity) {
    super(teamName, wins);
    stadium = new Stadium(capacity);
  }

  public void fillTeam () {
    
  }

  public Stadium getStadium () {
    return stadium;
  }
}
