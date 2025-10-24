package src.team;

import src.player.Player;
import java.util.List;
import java.util.ArrayList;

// public abstract class FootballTeam {
public class FootballTeam {
  protected String name;
  protected int wins;
  protected int yearFoundation;
  protected List<Player> players;

  public FootballTeam () {
    this.name = "Unknown team";
    this.wins = 0;
    this.yearFoundation = 0;
    this.players = new ArrayList<>();
  }

  public FootballTeam (String name, int numbers, int year) {
    this.name = name;
    this.wins = numbers;
    this.yearFoundation = year;
    this.players = new ArrayList<>();
  }

  public void addPlayer (Player player) {
    this.players.add(player);
  }

  public String getName () {
    return this.name;
  }

  public int getWins () {
    return this.wins;
  }

  public int getYear () {
    return this.yearFoundation;
  }

  public List<Player> getPlayers () {
    return new ArrayList<>(this.players);
  }
}
