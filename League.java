public class League {
    // data fields
    private String[] teams;
    private String leagueName;
    private int currentSeason;

    public League(){
        this.teams = String[0];
        this.leagueName = "Ghana Premier League";
        this.currentSeason = 1;

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
        String[] newTeams = new String[teams.length + 1];

        for (int i = 0; i < teams.length; i++){
            newTeams[i] = teams[i];
        }
        newTeams[teams.length] = team.getName;
        teams = newTeams;

    }

    public void removeTeam(Team team) { 
        String countBeforeRemoval = team.getTeamName();
        int count = 0;

        for(i=0; i< teams.length; i++){
            if(!teams.equals(CountBeforeRemoval)){
                count++;
            }
        }

        String teamRemoval = new String[countBeforeRemoval];
        int index = 0;
        for(int i=0; i < teams.length; i++){
            if(!team.equals(CountBeforeRemoval)){
                counBeforeRemoval[index] = teams[i];
                index++;
            }
        }


    }

    public int matchweek() { 
        if(teams<2){
            return 0;
        }
        return (teams.length -1) * 2; 
    }
}
