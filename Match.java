public class Match extends League {
    private String homeTeam;
    private String awayTeam;
    private String date;
    private int homeGoals;
    private int awayGoals;
    
    
    public Match() {
    }
    
    public Match(String[] teams, String leagueName, int currentSeason, String homeTeam, String awayTeam, String date,
            int homeGoals, int awayGoals) {
        super(teams, leagueName, currentSeason);
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.date = date;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    //Craeting the Getter and Setters
    
    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }
    //Other Methods
    public void recordScore(int homeGoals, int awayGoals) { 

    }

    public Team getWinner() { 
        return null; 
    }
}


