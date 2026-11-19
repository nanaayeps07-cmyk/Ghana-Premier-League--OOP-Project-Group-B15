public class LeagueTable extends League{
    private Team[] teamStandings;

    public LeagueTable() {
    }

    public LeagueTable(String[] teams, String leagueName, int currentSeason, Team[] teamStandings) {
        super(teams, leagueName, currentSeason);
        this.teamStandings = teamStandings;
    }

    //Craeting the Getter and Setters

    public Team[] getTeamStandings() {
        return teamStandings;
    }

    public void setTeamStandings(Team[] teamStandings) {
        this.teamStandings = teamStandings;
    }
    
    //Other Methods
    public void update(Match match) { 

    }
}
