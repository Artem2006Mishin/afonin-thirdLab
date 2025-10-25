package src.league;

import java.util.List;
import java.util.ArrayList;
import src.team.FootballTeam;
import src.team.esports.EsportsTeam;
import src.team.sports.SportsTeam;

public class League {
  private static List<FootballTeam> league = new ArrayList<>();

  public static void push (String name, int wins, int capacity) {
    SportsTeam team = new SportsTeam(name, wins, capacity);
    league.add(team);
  }

  public static void push (String name, int wins, String platformName) {
    EsportsTeam team = new EsportsTeam(name, wins, platformName);
    league.add(team);
  }
}
