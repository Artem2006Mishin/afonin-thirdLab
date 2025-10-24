package src.player;

public class Player {
  private String name;
  private String position;
  private int age;
  
  public Player () {
    this.name = "";
    this.position = "";
    this.age = 0;
  }

  public Player (String name, String position, int age) {
    this.name = name;
    this.position = position;
    this.age = age;
  }

  @Override
  public String toString () {
    return String.format
      ("Имя игрока: %s%n возраст: %d%n позиция: %s%n голы за последний матч: %d",
      name, age, position);
  }
}
