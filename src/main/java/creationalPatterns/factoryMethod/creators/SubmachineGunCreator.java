package creationalPatterns.factoryMethod.creators;

import creationalPatterns.factoryMethod.factory.WeaponFactory;
import creationalPatterns.factoryMethod.weaponType.SubmachineGun;
import creationalPatterns.factoryMethod.weaponType.Weapon;

public class SubmachineGunCreator implements WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new SubmachineGun();
    }

}
