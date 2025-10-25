package src;

import java.util.List;
import java.util.ArrayList;

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

  // сделал на время public, поменять на protected (там почему-то ошибка)
  protected String getInfo () {
    return String.format("название команды: %s%n кол-во побед: %d%n", 
      this.name, this.wins);
  }

  public static String findTeamByName (String targetName) {
    FootballTeam foundTeam = league.stream()
      .filter(p -> p.getName().equalsIgnoreCase(targetName))
      .findFirst()
      .orElse(null);
    
    // + валидация на null - если не нашли такую команду
    return foundTeam.getInfo();
    // if (foundTeam instanceof EsportsTeam) {
    //   return ((EsportsTeam) foundTeam).getInfo();
    // } else {
    //   return null;
    // }
  }

  public String getName () {
    return this.name;
  }

  // public int getWins () {
  //   return this.wins;
  // }

  // protected abstract void fillTeam ();
}
