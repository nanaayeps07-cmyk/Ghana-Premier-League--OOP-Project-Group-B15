public class League {
    // data fields
    private String[] teams;
    private String leagueName;
    private int currentSeason;

    public League(){

    }

    public League(String[] teams, String leagueName, int currentSeason){
        this.currentSeason = currentSeason;
        this.teams=teams;
        this.leagueName=leagueName;
    }

    //Craeting the Getter and Setters
    
    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public int getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(int currentSeason) {
        this.currentSeason = currentSeason;
    }

    //Other Methods
    public void addTeam(Team team) { 

    }

    public void removeTeam(Team team) { 

    }

    public int matchweek() { 
        return 0; 
    }
}
