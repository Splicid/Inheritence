package WPNS;


public abstract class TieWeapon {
    private String model;
    
    public TieWeapon() {
    	
    }
    public TieWeapon(String model){
        this.model = model;
    }
    
    public abstract void fire();
}
