package src;

public class SportsTeam extends FootballTeam {

    public SportsTeam() {
        super();
    }

    public SportsTeam(String teamName, int wins, int capacity) {
        super(teamName, wins);
    }

    public void fillTeam() {

    }

    public static void push(String teamName, int wins, int capacity) {
        SportsTeam team = new SportsTeam(teamName, wins, capacity);
        league.add(team);
    }
}
