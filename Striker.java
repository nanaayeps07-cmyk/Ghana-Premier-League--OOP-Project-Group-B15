public class Striker extends Player {

    public Striker() {
    }

    public Striker(String[] teams, String leagueName, int currentSeason, String name, int age, double height,
            String nationality, int jerseyNo) {
        super(teams, leagueName, currentSeason, name, age, height, nationality, jerseyNo);
    }
    
    @Override
    public double calculateRating() { 
        double rating = 4.5 + goalsPerMatch() * 3;
        if(rating > 10.0){
            rating = 10.0;
        }
       return rating;
    }
}
