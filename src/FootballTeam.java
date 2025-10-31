package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class FootballTeam {
  protected static List<FootballTeam> league = new ArrayList<>();

  protected String name;
  protected int wins;

  /**
   * Конструктор по умолчанию
   */
  protected FootballTeam() {
    this.name = "Unknown team";
    this.wins = 0;
  }

  /**
   * Конструктор с параметрами
   */
  protected FootballTeam(String name, int wins) {
    this.name = name;
    this.wins = wins;
  }

  /**
   * Определяет команду с самым большим количеством побед
   * 
   * @return строка с информацией о команде
   */
  public static String findWinnerTeam () {
    if (league == null || league.isEmpty()) 
      throw new IllegalArgumentException("Список команд не может быть пустым");

    FootballTeam fouTeam = league.stream()
      .max(Comparator.comparingInt(p -> p.wins))
      .orElseThrow(() -> new IllegalArgumentException("В лиге нет команд"));

    return fouTeam.getInfo();
  }

  /**
   * Определяет команды с количеством побед больше среднего
   * 
   * @return список строк с информацией о каждой команде
   */
  public static List<String> findAboveAverageTeams () {
    if (league == null || league.isEmpty()) 
      throw new IllegalArgumentException("Список команд не может быть пустым");

    double averageWins = league.stream()
      .mapToInt(p -> p.wins)
      .average()
      .orElse(0);

    List<String> foundTeams = league.stream()
      .filter(p -> p.wins > averageWins)
      .map(p -> p.getInfo())
      .toList();

    return foundTeams;
  }

  /**
   * Упорядочивает массив по убыванию мест в лиге
   * 
   * @return список строк всех команды по убыванию мест в лиге
   */
  public static List<String> sortTeamsReversed () {
    if (league == null || league.isEmpty()) 
      throw new IllegalArgumentException("Список команд не может быть пустым");

    List<String> teams = league.stream()
      .sorted(Comparator.comparingInt((FootballTeam p) -> p.wins).reversed())
      .map(p -> p.getInfo())
      .toList();
    
    return teams;
  }

  /**
   * Редактирует определенную команду
   * 
   * @param teamName название команды, которую нужно отредактировать
   * @param field поле, которое нужно отредактировать
   * @param newValue новое значение для поля
   * @return обновленную информацию о команде
   */
  public static String findAndEditTeam (String teamName, String field, String newValue) {
    FootballTeam team = findTeamByName(teamName);
    team.editTeam(field, newValue);
    return team.getInfo();
  }

  /**
   * Ищет команду в лиге по названию
   * 
   * @param targetName название искомое команды
   * @return найденная команда
   */
  private static FootballTeam findTeamByName(String targetName) {
    if (league == null || league.isEmpty()) 
      throw new IllegalArgumentException("Список команд не может быть пустым");
  
    FootballTeam foundTeam = league.stream()
      .filter(p -> p.name.equalsIgnoreCase(targetName))
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException("Команда" + targetName + "не найдена"));

    return foundTeam;
  }

  /**
   * Возвращает информацию о команде
   * 
   * @return строка с информацию о команде
   */
  protected String getInfo() {
    return String.format("название команды: %s%nкол-во побед: %d%n",
      this.name, this.wins);
  }

  /**
   * Редактирует команду
   * 
   * @param field поле которое нужно отредактировать
   * @param newValue новое значение
   */
  protected void editTeam (String field, String newValue) {
    if (field.equals("name")) {
      this.name = newValue;
    } else if (field.equals("wins")) {
      this.wins = Integer.parseInt(newValue);
    } else {
      throw new IllegalArgumentException("Такого поля не существует");
    }
  }
}
