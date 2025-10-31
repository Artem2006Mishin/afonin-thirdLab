package src;

public class EsportsTeam extends FootballTeam {
    private String platform;

    private EsportsTeam() {
        super();
    }

    private EsportsTeam(String teamName, int wins, String platformName) {
        super(teamName, wins);
        this.platform = platformName;
    }

    public static void push(String teamName, int wins, String platformName) {
        EsportsTeam team = new EsportsTeam(teamName, wins, platformName);
        league.add(team);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                String.format("игровая платформа: %s%n", this.platform);
    }

    // private void fillTeam () {

    // }

    // public GamePlatform getPlatform () {
    // return platform;
    // }
}
