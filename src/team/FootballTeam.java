package src.team;

public abstract class FootballTeam {
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

  protected abstract void fillTeam ();
}
