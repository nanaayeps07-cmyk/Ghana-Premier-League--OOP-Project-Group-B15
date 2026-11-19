public class Goalkeeper extends Player {
    private int noOfSaves;
    private int cleanSheets;
    
    
    public Goalkeeper() {
    }


    public Goalkeeper(String[] teams, String leagueName, int currentSeason, String name, int age, double height,
            String nationality, int jerseyNo, int noOfSaves, int cleanSheets) {
        super(teams, leagueName, currentSeason, name, age, height, nationality, jerseyNo);
        this.noOfSaves = noOfSaves;
        this.cleanSheets = cleanSheets;
    }

    //Craeting the Getter and Setters
    public int getNoOfSaves() {
        return noOfSaves;
    }


    public void setNoOfSaves(int noOfSaves) {
        this.noOfSaves = noOfSaves;
    }


    public int getCleanSheets() {
        return cleanSheets;
    }


    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }
    
    //Other Methods
    public void saves() { 
        
    }

    @Override
    public double calculateRating() { 
        return 0.0; 
    }
}


