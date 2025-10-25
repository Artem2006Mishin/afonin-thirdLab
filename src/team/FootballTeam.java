package src.team;

import java.util.ArrayList;
import java.util.List;

public abstract class FootballTeam {
  protected static List<FootballTeam> league = new ArrayList<>();

  protected String name;
  protected int wins;
  
  protected FootballTeam () {
    this.name = "Unknown team";
    this.wins = 0;
  }

  protected FootballTeam (String name, int wins) {
    this.name = name;
    this.wins = wins;
  }

  public String getName () {
    return this.name;
  }

  public int getWins () {
    return this.wins;
  }

  protected abstract void push (String name, int wins);

  // protected abstract void fillTeam ();
}
