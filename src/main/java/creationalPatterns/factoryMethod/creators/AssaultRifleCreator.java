package creationalPatterns.factoryMethod.creators;

import creationalPatterns.factoryMethod.factory.WeaponFactory;
import creationalPatterns.factoryMethod.weaponType.AssaultRifle;
import creationalPatterns.factoryMethod.weaponType.Weapon;

public class AssaultRifleCreator implements WeaponFactory {

    @Override
    public Weapon createWeapon() {
        return new AssaultRifle();
    }
}
