package src.team;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class FootballTeam {
    protected static List<FootballTeam> league = new ArrayList<>();

    protected String name;
    protected int wins;

    protected FootballTeam() {
        this.name = "Unknown team";
        this.wins = 0;
    }

    protected FootballTeam(String name, int wins) {
        this.name = name;
        this.wins = wins;
    }

    protected abstract void push(String name, int wins);

    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public static int averageWins() {
        int totalWins = 0;
        for (FootballTeam team : league) {
            totalWins += team.wins;
        }
        return totalWins / league.size();
    }

    public static String getWinner() {
        FootballTeam winner = league.get(0);
        for (FootballTeam team : league) {
            if (team.getWins() > winner.getWins()) {
                winner = team;
            }
        }
        return winner.name;
    }

    public static String getMoreAverageTeams() {
        int average = averageWins();
        String output = "";
        for (FootballTeam team : league) {
            if (team.wins > average) {
                output += String.format("Команда: %s, количество побед: %d\n", team.name, team.wins);
            }
        }
        return output;
    }

    public static void sortTeams() {
        league.sort(Comparator.comparingInt(FootballTeam::getWins));
    }

    public static void searchTeam(String name) {
        for (FootballTeam team : league) {
            if (team.name.equals(name)) {
                System.out.println(String.format("Команда: %s, количество побед: %d", team.name, team.wins));
            } else {
                System.out.println("Команда не найдена");
            }
        }
    }
}
