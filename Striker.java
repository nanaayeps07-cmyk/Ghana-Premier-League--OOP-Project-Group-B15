public class Striker extends Player {

    public Striker() {
    }

    public Striker(String[] teams, String leagueName, int currentSeason, String name, int age, double height,
            String nationality, int jerseyNo) {
        super(teams, leagueName, currentSeason, name, age, height, nationality, jerseyNo);
    }
    
    @Override
    public double calculateRating() { 
        return 0.0; 
    }
}
