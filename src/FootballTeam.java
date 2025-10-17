package src;

public abstract class FootballTeam {
  protected String name;
  protected int wins;

  /**
   * Конструктор абстрактного класса FootballTeam,
   * который инициализирует название и кол-во
   * побед футбольной команды.
   * 
   * @param name название команды
   * @param numbers кол-во побед команды
   */
  public FootballTeam (String name, int numbers) {
    this.name = name;
    this.wins = numbers;
  }
  
  /**
   * Возвращает информацию о футбольной команде
   * 
   * @return информация о команде
   */
  public String printInfo () {
    return String.format("Название команды: %s\nКол-во побед: %d",
      this.name, this.wins);
  }

  /**
   * Устанавливает имя команды
   * 
   * @param name новое имя команды
   */
  public void setName (String name) { this.name = name; }

  /**
   * Устанавливает кол-во побед команды
   * 
   * @param numbers новое кол-во побед команды
   */
  public void setWins (int numbers) { this.wins = numbers; }

  /**
   * Возвращает имя команды
   * 
   * @return имя команды
   */
  public String getName () { return this.name; }

  /**
   * Возвращает кол-во побед команды
   * 
   * @return кол-во побед команды
   */
  public int getWins () { return this.wins; }
}
