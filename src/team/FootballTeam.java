package src.team;

public abstract class FootballTeam {
  protected String name;
  protected int wins;

  public FootballTeam () {
    this.name = "Unknown team";
    this.wins = 0;
  }

  public FootballTeam (String name, int numbers, int year) {
    this.name = name;
    this.wins = numbers;
  }

  public String getName () {
    return this.name;
  }

  public int getWins () {
    return this.wins;
  }

  // generateTeam - статический метод который запрашивает UI
}
