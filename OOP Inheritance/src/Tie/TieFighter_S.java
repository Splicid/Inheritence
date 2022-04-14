package Tie;
import SPT.*;

public class TieFighter_S extends TieFighter {
    
private TiePilot  pilot;
private String IDNumber;
    public TieFighter_S(String IDNumber, TiePilot pilot){
        super("Tie Standard", pilot);
    }
    
    public void FiresCannons() {
    	
    }
        
    public void displayFighterData(){
        System.out.println("*****Imperial Pilot*****");
        System.out.println("ID: " );
        System.out.println("RANK: " );
    }
    

}
