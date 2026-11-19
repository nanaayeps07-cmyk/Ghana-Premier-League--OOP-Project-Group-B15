public class Defender extends Player {
    private int tackles;
    private int cleanSheets;
    
    
    public Defender() {
    }


    public Defender(String[] teams, String leagueName, int currentSeason, String name, int age, double height,
            String nationality, int jerseyNo, int tackles, int cleanSheets) {
        super(teams, leagueName, currentSeason, name, age, height, nationality, jerseyNo);
        this.tackles = tackles;
        this.cleanSheets = cleanSheets;
    }

    //Craeting the Getter and Setters

    public int getTackles() {
        return tackles;
    }


    public void setTackles(int tackles) {
        this.tackles = tackles;
    }


    public int getCleanSheets() {
        return cleanSheets;
    }


    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    //Other Methods
    @Override
    public double calculateRating() { 
        return 0.0; 
    }
}
