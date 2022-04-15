package WPNS;


public class ProtonBomb extends TieWeapon {
    private int yield = 7;
    private boolean dropped = false;
    
    public ProtonBomb(String model){
        System.out.println("Fired from Laser Cannon");
    }
    
    @Override
    public void fire(){
        dropped = true;
        System.out.println("Fired from Laser Cannon");
    }
    
    public boolean bombTarget() {
    	return true;
    }
}
