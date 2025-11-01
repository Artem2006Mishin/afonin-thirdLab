package src;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class UI {
  private static final Scanner READER;
  static {
    try {
      System.setOut(new PrintStream(System.out, true, "CP866"));
    } catch (UnsupportedEncodingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    READER = new Scanner(System.in);
  }

  private void createTeam() {
    try {
      System.out.print("Введите название команды: ");
      String name = READER.nextLine();
      if (name.isEmpty()) {
        throw new IllegalArgumentException("Название команды не может быть пустым");
      }

      System.out.print("Введите кол-во побед: ");
      int wins = Integer.parseInt(READER.nextLine());
      if (wins < 0) {
        throw new IllegalArgumentException("Количество побед не может быть отрицательным");
      }

      System.out.println("Введите 1 если спортивная");
      System.out.println("Введите 2 если киберспортивная");
      System.out.print("Введите цифру: ");
      int choose = Integer.parseInt(READER.nextLine());

      if (choose == 1) {
        System.out.print("Введите вместимость стадиона: ");
        int capacity = Integer.parseInt(READER.nextLine());

        SportsTeam.push(name, wins, capacity);

      } else if (choose == 2) {
        System.out.print("Введите название гейм-платформы: ");
        String platform = READER.nextLine();

        EsportsTeam.push(name, wins, platform);
      } else {
        throw new IllegalArgumentException("Введите 1/2");
      }
    } catch (NumberFormatException e) {
      System.out.println("Введите корректное число");
      createTeam();
    } catch (IllegalArgumentException e) {
      System.out.println("Ошибка: " + e.getMessage());
      createTeam();
    } catch (Exception e) {
      System.out.println("Ошибка: " + e.getMessage());
      createTeam();
    }
  }

  // ДОБАВИТЬ ВАЛИДАЦИЮ НА ВВОД
  // private void printTeam() {
  // System.out.print("Введите название команды, которую хотите найти: ");
  // String target = READER.nextLine();

  // String result = EsportsTeam.findTeamByName(target);
  // System.out.println(result);
  // }

  // run() - спрашивает пользователя команды
  public void run() {
    createTeam();
    SportsTeam.fillTeam();
    List<String> res = FootballTeam.findAboveAverageTeams();
    String winner = FootballTeam.findWinnerTeam();
    for (String r : res) {
      System.out.println(r);
    }

    System.out.println("Победитель: " + winner);
  }
}
