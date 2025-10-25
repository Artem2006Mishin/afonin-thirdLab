package src.team.esports;

import src.team.FootballTeam;
import src.team.sports.SportsTeam;

public class EsportsTeam extends FootballTeam {
  private String platform;

  public EsportsTeam() {
    super();
  }

  public EsportsTeam(String teamName, int wins) {
    super(teamName, wins);
  }

  @Override
  public void push(String name, int wins) {
    FootballTeam team = new SportsTeam(name, wins);
    FootballTeam.league.add(team);
  }
}
