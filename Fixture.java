public class Fixture extends League{
    private int matchWeekNo;
    private Match[] listMatch;
    
    
    public Fixture() {
    }


    public Fixture(String[] teams, String leagueName, int currentSeason, int matchWeekNo, Match[] listMatch) {
        super(teams, leagueName, currentSeason);
        this.matchWeekNo = matchWeekNo;
        this.listMatch = listMatch;
    }

    //Craeting the Getter and Setters
    public int getMatchWeekNo() {
        return matchWeekNo;
    }


    public void setMatchWeekNo(int matchWeekNo) {
        this.matchWeekNo = matchWeekNo;
    }


    public Match[] getListMatch() {
        return listMatch;
    }


    public void setListMatch(Match[] listMatch) {
        this.listMatch = listMatch;
    }

    //Other Methods
    public void addMatch(Match match) { 
        
    }
}