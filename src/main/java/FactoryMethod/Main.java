package FactoryMethod;

import FactoryMethod.creators.AssaultRifleCreator;
import FactoryMethod.factory.WeaponFactory;
import FactoryMethod.weaponType.Weapon;

public class Main {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new AssaultRifleCreator();
        Weapon weapon = weaponFactory.createWeapon();
        weapon.sound();
    }
}
