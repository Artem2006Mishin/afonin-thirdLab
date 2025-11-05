package src;

public class SportsTeam extends FootballTeam {
  protected int capacity; // вместимость стадиона

    /**
     * Конструктор по умолчанию
     */
  protected SportsTeam() {
    super();
    this.capacity = 0;
  }

    /**
     * Конструктор с параметрами
     *
     * @param teamName название команды
     * @param wins кол-во побед команды
     * @param capacity вместимость стадиона
     */
  protected SportsTeam(String teamName, int wins, int capacity) {
    super(teamName, wins);
    this.capacity = capacity;
  }

    /**
     * Добавляет команду в лигу
     *
     * @param teamName название команды
     * @param wins кол-во побед команды
     * @param capacity вместимость стадиона
     */
  public static void push(String teamName, int wins, int capacity) {
      SportsTeam team = new SportsTeam(teamName, wins, capacity);
      league.add(team);
  }

    /**
     * Генерирует команды
     */
  public static void fillTeam () {
    push("Chelsea", 5, 70);
    push("Liverpool", 2, 40);
    push("Manchester United", 7, 100);
  }

    /**
     * Возвращает строку с информацией о команде
     */
  @Override
  public String getInfo() {
    return super.getInfo() +
    String.format("кол-во мест: %s", this.capacity);
  }

    /**
     * Редактирует команду
     *
     * @param field поле которое нужно отредактировать
     * @param newValue новое значение
     */
  @Override
  protected void editTeam (String field, String newValue) {
    if (field.equals("capacity")) {
      this.capacity = Integer.parseInt(newValue);
    } else {
      super.editTeam(field, newValue);
    }
  }
}
