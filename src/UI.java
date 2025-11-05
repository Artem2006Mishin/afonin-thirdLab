package src;

import java.util.Scanner;
import java.util.List;

public class UI {
  private static final Scanner READER = new Scanner(System.in);

    /**
     * Создать команду UI
     */
  private void createTeamUI() {
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
      String choose = READER.nextLine();

      if (choose.equals("1")) {
        System.out.print("Введите вместимость стадиона: ");
        int capacity = Integer.parseInt(READER.nextLine());
        SportsTeam.push(name, wins, capacity);
      } else if (choose.equals("2")) {
        System.out.print("Введите название гейм-платформы: ");
        String platform = READER.nextLine();
        EsportsTeam.push(name, wins, platform);
      } else {
        throw new IllegalArgumentException("Введите 1/2");
      }
    } catch (NumberFormatException e) {
      System.out.println("Введите корректное число");
    } catch (IllegalArgumentException e) {
      System.out.println("Ошибка: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }

    /**
     * Создать команды дефолтными значениями
     */
  private void createDefaultTeamUI () {
    System.out.print("1. Спортивная\n" +
            "2. Киберспортивная\n" +
            "Выберите тип команды: ");
    String choose = READER.nextLine();
    try {
        if (choose.equals("1")) {
            SportsTeam.fillTeam();
        } else if (choose.equals("2")) {
            EsportsTeam.fillTeam();
        } else {
            throw new IllegalArgumentException("Введите 1/2");
        }
    } catch (Exception e) {
        System.out.println("Ошибка: " + e.getMessage() + "\n");
    }
  }

    /**
     * Найти команду по имени UI
     */
  private void findWinnerUI () {
      try {
          String result = FootballTeam.findWinnerTeam();
          System.out.println(result);
      } catch (Exception e) {
          System.out.println("Ошибка: " + e.getMessage());
      }
  }

    /**
     * Найти команды с побед больше среднего
     */
  private void findAboveAverageTeamsUI () {
      try {
          List<String> result = FootballTeam.findAboveAverageTeams();
          for (String r : result) {
              System.out.println(r);
              System.out.println();
          }
      } catch (Exception e) {
          System.out.println("Ошибка: " + e.getMessage());
      }
  }

    /**
     * Отсортировать команды по убыванию
     */
  private void sortTeamsReversedUI () {
      try {
          List<String> result = FootballTeam.sortTeamsReversed();
          for (String r : result) {
              System.out.println(r);
              System.out.println();
          }
      } catch (Exception e) {
          System.out.println("Ошибка: " + e.getMessage());
      }
  }

    /**
     * Открдактировать команду
     */
  private void editTeamUI () {
      try {
          System.out.print("Введите название команды: ");
          String outputName = READER.nextLine();

          System.out.print("Редактируемое поле: ");
          String outputField = READER.nextLine();

          System.out.print("Новое значение поле: ");
          String outputNewValue = READER.nextLine();

          String result = FootballTeam.findAndEditTeam(outputName, outputField, outputNewValue);
          System.out.print(result);
      } catch (Exception e) {
          System.out.println("Ошибка: " + e.getMessage());
      }
  }

    /**
     * Спрашивает пользователя команды
     */
  public void run() {
    String choose = "";
    while (!choose.equals("0")) {
        System.out.print("0. Выход\n" +
        "1. Добавить команду\n" +
        "2. Заполнить команду по умолчанию\n" +
        "3. Определить команду с самым большим кол-вом побед\n" +
        "4. Определить команды с количеством побед больше среднего\n" +
        "5. Упорядочить массив по убыванию мест в лиге\n" +
        "6. Редактировать определенную команду\n" + "Выберите действие: ");

        choose = READER.nextLine();
        System.out.println();
        if (choose.equals("1")) {
            createTeamUI();
        } else if (choose.equals("2")) {
            createDefaultTeamUI();
        } else if (choose.equals("3")) {
            findWinnerUI();
        } else if (choose.equals("4")) {
            findAboveAverageTeamsUI();
        } else if (choose.equals("5")) {
            sortTeamsReversedUI();
        } else if (choose.equals("6")) {
            editTeamUI();
        } else if (choose.equals("0")) {
            System.out.println("До свидания!");
            break;
        } else {
            System.out.println("Выберите вариант из предолженных (0-6)\n");
        }
        System.out.println();
    }
  }
}
