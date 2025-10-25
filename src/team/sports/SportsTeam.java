package src.team.sports;

import src.team.FootballTeam;

public class SportsTeam extends FootballTeam {
    private int stadiumCapacity;

    public SportsTeam() {
        super();
        this.stadiumCapacity = 0;
    }

    public SportsTeam(String teamName, int wins, int stadiumCapacity) {
        super(teamName, wins);
        this.stadiumCapacity = stadiumCapacity;
    }

    @Override
    public void push(String name, int wins) {
        FootballTeam team = new SportsTeam(name, wins, 0);
        FootballTeam.league.add(team);
    };

    public void push(String name, int wins, int stadiumCapacity) {
        FootballTeam team = new SportsTeam(name, wins, stadiumCapacity);
        FootballTeam.league.add(team);
    }
}
