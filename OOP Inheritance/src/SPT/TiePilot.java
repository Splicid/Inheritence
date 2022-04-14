package SPT;

public class TiePilot {
    private String IDNumber;
    private String rank;
    private String pilotRating;
    
    public TiePilot(String IDNumber, String rank, String pilotRating){
        this.IDNumber = IDNumber;
        this.rank = rank;
        this.pilotRating = pilotRating;
    }
    public void displayFighterData(){
        System.out.println("ID: " + this.IDNumber);
        System.out.println("RANK: " + this.rank);
        System.out.println("RATING: " + this.pilotRating);
    }
}
