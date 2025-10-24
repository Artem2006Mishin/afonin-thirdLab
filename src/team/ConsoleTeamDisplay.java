package src.team;

import src.player.Player;

public class ConsoleTeamDisplay implements TeamDisplay {
  @Override
  public void display(FootballTeam team) {
    System.out.println("Имя команды: " + team.getName());
    System.out.println("Год основания: " + team.getYear());
    System.out.println("Кол-во побед: " + team.getWins());

    System.out.println("Состав команды: ");
    for (Player p : team.getPlayers()) {
      System.out.println(p);
    }
  }
}
