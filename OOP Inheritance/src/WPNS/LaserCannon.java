package WPNS;

public class LaserCannon extends TieWeapon {
    private int maxRange = 1000;
    private int ammoCapacity = 500;
    private int currentAmmoCount = 500;
    
    
    public LaserCannon(String model){
        super(model);
    }
    
    @Override
    public void fire(){
        if(currentAmmoCount > 0){
            currentAmmoCount --;
        }else{
            System.out.println("Laser is empty. Go back to base!");
        }
        System.out.println("Fired from Laser Cannon you now have" + currentAmmoCount);
    }

	public int getAmmoCapacity() {
		return ammoCapacity;
	}

	public void setAmmoCapacity(int ammoCapacity) {
		this.ammoCapacity = ammoCapacity;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}
}