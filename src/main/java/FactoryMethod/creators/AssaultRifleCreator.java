package FactoryMethod.creators;

import FactoryMethod.factory.WeaponFactory;
import FactoryMethod.weaponType.AssaultRifle;
import FactoryMethod.weaponType.Weapon;

public class AssaultRifleCreator implements WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new AssaultRifle();
    }
}
