package src.team.display;

import src.team.FootballTeam;
import src.team.esports.EsportsTeam;
import src.team.sports.SportsTeam;

public class ConsoleTeamDisplay implements TeamDisplayable {
  @Override
  public void display(FootballTeam team) {
    System.out.println("Имя команды: " + team.getName());
    System.out.println("Кол-во побед: " + team.getWins());

    if (team instanceof SportsTeam) {
      System.out.println("Размерность стадиона: " + 
        ((SportsTeam)team).getStadium().getCapacity());
    } else if (team instanceof EsportsTeam) {
      System.out.println("Игровая платформа: " + 
        ((EsportsTeam)team).getPlatform().getName());
    }
  }
}
