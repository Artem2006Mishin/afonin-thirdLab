package src.team.esports;

import src.team.FootballTeam;

public class EsportsTeam extends FootballTeam {
    private String platform;

    public EsportsTeam() {
        super();
    }

    public EsportsTeam(String teamName, int wins, String platform) {
        super(teamName, wins);
        this.platform = platform;
    }

    @Override
    public void push(String name, int wins) {
        FootballTeam team = new EsportsTeam(name, wins, "");
        FootballTeam.league.add(team);
    };

    public void push(String name, int wins, String platform) {
        FootballTeam team = new EsportsTeam(name, wins, platform);
        FootballTeam.league.add(team);
    }
}
