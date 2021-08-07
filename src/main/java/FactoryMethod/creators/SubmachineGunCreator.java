package FactoryMethod.creators;

import FactoryMethod.factory.WeaponFactory;
import FactoryMethod.weaponType.SubmachineGun;
import FactoryMethod.weaponType.Weapon;

public class SubmachineGunCreator implements WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new SubmachineGun();
    }
}
