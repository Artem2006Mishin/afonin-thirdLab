package src;

import java.util.Scanner;

public class UI {
  private static final Scanner READER = new Scanner(System.in);

  // валидация нужна максон!
  private void createTeam () {
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

    } else {
      System.out.print("Введите название гейм-платформы: ");
      String platform = READER.nextLine();

      EsportsTeam.push(name, wins, platform);
    }
  }

  // сюда тоже валидацию!
  private void printTeam () {
    System.out.print("Введите название команды, которую хотите найти: ");
    String target = READER.nextLine();

    String result = EsportsTeam.findTeamByName(target);
    System.out.println(result);
  }

  // run() - спрашивает пользователя команды
  public void run () {
    createTeam();
    System.out.println();

    printTeam();
  }
}
