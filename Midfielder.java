public class Midfielder extends Player{
    private int keyPasses;
    private int chancesCreated; 
    private int interceptions;
    

    public Midfielder(String[] teams, String leagueName, int currentSeason, String name, int age, double height,
            String nationality, int jerseyNo, int keyPasses, int chancesCreated, int interceptions) {
        super(teams, leagueName, currentSeason, name, age, height, nationality, jerseyNo);
        this.keyPasses = keyPasses;
        this.chancesCreated = chancesCreated;
        this.interceptions = interceptions;
    }

    //Craeting the Getter and Setters

    public int getKeyPasses() {
        return keyPasses;
    }

    public void setKeyPasses(int keyPasses) {
        this.keyPasses = keyPasses;
    }

    public int getChancesCreated() {
        return chancesCreated;
    }

    public void setChancesCreated(int chancesCreated) {
        this.chancesCreated = chancesCreated;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    //Other Methods
    @Override
    public double calculateRating() { 
        double rating = 4.5 + keyPasses * 0.05 + chancesCreated * 0.1 + interceptions * 0.05;
        if(rating >10.0){
            rating = 10.0;
        }
        return rating; 
    }
}
