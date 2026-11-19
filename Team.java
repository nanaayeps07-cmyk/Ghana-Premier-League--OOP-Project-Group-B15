public class Team extends League {
    private String teamName;
    private int noOfPlayers;
    private String managerName;
    private String assistantManagerName;
    private String stadium;
    private String city;
    private int losses;
    private int wins; 
    private int draws;
    private Player[] players;
    
    public Team() {
    }

    public Team(String[] teams, String leagueName, int currentSeason, String teamName, int noOfPlayers,
            String managerName, String assistantManagerName, String stadium, String city, int losses, int wins,
            int draws, String[] player) {
        super(teams, leagueName, currentSeason);
        this.teamName = teamName;
        this.noOfPlayers = noOfPlayers;
        this.managerName = managerName;
        this.assistantManagerName = assistantManagerName;
        this.stadium = stadium;
        this.city = city;
        this.losses = losses;
        this.wins = wins;
        this.draws = draws;
        this.players = players;
    }

    //Craeting the Getter and Setters
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getAssistantManagerName() {
        return assistantManagerName;
    }

    public void setAssistantManagerName(String assistantManagerName) {
        this.assistantManagerName = assistantManagerName;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    //Other Methods
    public void teamStats() { 

    }

    public void resetStats() { 

    }

    public void addPlayer(Player player) { 

    }

    public void removePlayer(Player player) { 

    }

    public boolean isJerseyNoTaken(int jerseyNo) { 
        return false; 
    }
}
