public class Player extends League {
    private String name;
    private int age;
    private double height;
    private String nationality;
    private int jerseyNo;
   
    public Player() {
    }

    public Player(String[] teams, String leagueName, int currentSeason, String name, int age, double height,
            String nationality, int jerseyNo) {
        super(teams, leagueName, currentSeason);
        this.name = name;
        this.age = age;
        this.height = height;
        this.nationality = nationality;
        this.jerseyNo = jerseyNo;
    }
    
    //Craeting the Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    //Other Methods
    public void scoreGoal() { 

    }

    public void recordAssist() { 

    }

    public void yellowCards() { 

    }

    public void redCards() { 

    }

    public void playMatch(int minutes) { 

    }

    public double getGoalsPerMatch() { 
        return 0.0; 
    }

    public void pass() { 

    }

    public void shotsOnTarget() { 

    }

    public boolean isSentOff() { 
        return false; 
    }

    public boolean isInjured() { 
        return false; 
    }

    public boolean isEligibleToPlay() { 
        return false; 
    }

    public double calculateRating() { 
        return 0.0; 
    }
}