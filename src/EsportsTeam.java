package src;

public class EsportsTeam extends FootballTeam {
  protected String platform; // название платформы

  /**
   * Конструктор по умолчанию
   */
  protected EsportsTeam() {
    super();
    this.platform = "";
  }

  /**
   * Конструктор с параметрами
   * 
   * @param teamName название команды
   * @param wins кол-во побед команды
   * @param platformName название игровой платформы
   */
  protected EsportsTeam(String teamName, int wins, String platformName) {
    super(teamName, wins);
    this.platform = platformName;
  }

  /**
   * Добавляет команду в лигу
   * 
   * @param teamName название команды
   * @param wins кол-во побед команды
   * @param platformName название игровой платформы
   */
  public static void push(String teamName, int wins, String platformName) {
    EsportsTeam team = new EsportsTeam(teamName, wins, platformName);
    league.add(team);
  }

  /**
   * Генерирует команды
   */
  public static void fillTeam () {
    push("Natus Vincere", 11, "PC");
    push("Astralis", 8, "PC");
    push("G2 Esports", 3, "PC");
  }

    /**
     * Возвращает строку с информацией о команде
     */
  @Override
  public String getInfo() {
    return super.getInfo() +
    String.format("игровая платформа: %s", this.platform);
  }

    /**
     * Редактирует команду
     *
     * @param field поле которое нужно отредактировать
     * @param newValue новое значение
     */
  @Override
  protected void editTeam (String field, String newValue) {
    if (field.equals("platform")) {
      this.platform = newValue;
    } else {
      super.editTeam(field, newValue);
    }
  }
}
