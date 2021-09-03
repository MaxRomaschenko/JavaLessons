package creationalPatterns.factoryMethod;

import creationalPatterns.factoryMethod.creators.AssaultRifleCreator;
import creationalPatterns.factoryMethod.factory.WeaponFactory;
import creationalPatterns.factoryMethod.weaponType.AssaultRifle;
import creationalPatterns.factoryMethod.weaponType.MachineGunner;
import creationalPatterns.factoryMethod.weaponType.SubmachineGun;
import creationalPatterns.factoryMethod.weaponType.Weapon;

public class Main {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new AssaultRifleCreator();
        Weapon weapon = weaponFactory.createWeapon();
        weapon.shoot();
        MachineGunner machineGunner = new MachineGunner();
        machineGunner.giveWeapon(new SubmachineGun());
        machineGunner.fire();
        machineGunner.giveWeapon(new AssaultRifle());
        machineGunner.fire();
    }
}
