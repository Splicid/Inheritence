package Tie;
import SPT.*;
import WPNS.*;

public class TieFighter_H extends TieFighter {
	
private TiePilot  pilot;
private String IDNumber;

    public TieFighter_H(String IDNumber, TiePilot pilot){
        super("Tie Standard", pilot);
    }
    
    public void FiresCannons() {
    	LaserCannon laser = new LaserCannon(IDNumber);
    	System.out.println("Current Laser Ammo Count " + laser.getAmmoCapacity());
    }
        
    public void displayFighterData(){
        System.out.println("*****Imperial Pilot*****");
        System.out.println("ID: " );
        System.out.println("RANK: " );
    }
}
