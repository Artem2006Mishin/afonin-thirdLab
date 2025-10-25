package src.team.esports;

public class GamePlatform {
  private String name;

  public GamePlatform () {
    this.name = "Unknown platform";
  }

  public GamePlatform (String name) {
    this.name = name;
  }

  public String getName () {
    return name;
  }
}
