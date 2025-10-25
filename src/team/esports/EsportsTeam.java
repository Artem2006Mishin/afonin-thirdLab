package src.team.esports;

import src.team.FootballTeam;

public class EsportsTeam extends FootballTeam{
  private GamePlatform platform;
  
  public EsportsTeam () {
    super();
    platform = new GamePlatform();
  }

  public EsportsTeam (String teamName, int wins, String platformName) {
    super(teamName, wins);
    platform = new GamePlatform(platformName);
  }

  public void fillTeam () {

  }

  public GamePlatform getPlatform () {
    return platform;
  }
}
