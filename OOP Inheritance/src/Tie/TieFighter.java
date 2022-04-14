package Tie;
import SPT.*;
import WPNS.*;

public abstract class TieFighter {
    private String manufacturer;
    private String IDNumber;
    private String model;
    private TieWeapon[] TieWeapon;
    private TiePilot  pilot;
    private String fighterClass;
    private double length;
    private double width;
    private double height;
    private int fuelCapacity;
    private int maxSpeed;
    private boolean isSpaceBorne;
    private boolean isLanded;
    private Location currentLocation;
    
    public TieFighter(String IDNumber, TiePilot pilot){
        this.pilot = pilot;
        this.IDNumber = IDNumber;
    }
    public TieFighter(String manufacturer, String model, String fighterClass, double length, double width, double height,
    int fuelCapacity, int maxSpeed, boolean isLanded, Location currentLocation){
        this.manufacturer = manufacturer;
        this.model = model;
        this.fighterClass = fighterClass;
        this.length = length;
        this.width = width;
        this.height = height;
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
        this.isLanded = isLanded;
        this.currentLocation = currentLocation;
    }
    
    public void displayFighterData1(){
        System.out.println("*****Imperial Pilot*****");
        System.out.println("Model: " +  this.IDNumber);
        System.out.println("ID Number: " + this.IDNumber );
        pilot.displayFighterData();	
        
        
    }
    
    public void FiresCannon(){
        System.out.println();
    }
}
