package creationalPatterns.factoryMethod.weaponType;

public class MachineGunner {
    private Weapon weapon;

    public void fire(){
        this.weapon.shoot();
    }
    public void giveWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
