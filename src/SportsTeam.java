package src;

public class SportsTeam extends FootballTeam {
  protected int capacity;

  protected SportsTeam() {
    super();
    this.capacity = 0;
  }

  protected SportsTeam(String teamName, int wins, int capacity) {
    super(teamName, wins);
    this.capacity = capacity;
  }

  public static void push(String teamName, int wins, int capacity) {
      SportsTeam team = new SportsTeam(teamName, wins, capacity);
      league.add(team);
  }

  @Override
  public String getInfo() {
    return super.getInfo() +
    String.format("кол-во мест: %s%n", this.capacity);
  }

  @Override
  protected void editTeam (String field, String newValue) {
    if (field.equals("capacity")) {
      this.capacity = Integer.parseInt(newValue);
    } else {
      super.editTeam(field, newValue);
    }
  }

  protected static void fillTeam () {
    push("Chelsea", 5, 70);
    push("Liverpool", 2, 40);
    push("Manchester United", 7, 100);
  }
}
