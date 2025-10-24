import src.player.Player;
import src.team.ConsoleTeamDisplay;
import src.team.FootballTeam;
import src.team.TeamDisplay;

public class Main {
  public static void main(String[] args) {
    Player p1 = new Player("artem", "нападающий", 19);
    Player p2 = new Player("maxon", "защитник", 18);

    FootballTeam team = new FootballTeam("Real Madrid", 0, 1902);

    team.addPlayer(p1);
    team.addPlayer(p2);

    TeamDisplay display = new ConsoleTeamDisplay();
    display.display(team);
  }
}
