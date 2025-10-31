package src;

import java.util.Scanner;
import java.util.List;

public class UI {
  private static final Scanner READER = new Scanner(System.in);

  private void createTeam() {
    System.out.print("Введите название команды: ");
    String name = READER.nextLine();

    System.out.print("Введите кол-во побед: ");
    int wins = Integer.parseInt(READER.nextLine());

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
  }

  // ДОБАВИТЬ ВАЛИДАЦИЮ НА ВВОД
  // private void printTeam() {
  //   System.out.print("Введите название команды, которую хотите найти: ");
  //   String target = READER.nextLine();

  //   String result = EsportsTeam.findTeamByName(target);
  //   System.out.println(result);
  // }

  // run() - спрашивает пользователя команды
  public void run() {
    SportsTeam.fillTeam();
    List<String> res = FootballTeam.findAboveAverageTeams();

    for (String r : res) {
      System.out.println(r);
    }

  }
}
