package Items.Weapon;

import Items.Item;

public abstract class Weapon extends Item{

    public int damage;
    public int rateOfFire;
    public int magazineSize;
    public int reloadTime;
    public int damagePerSecond = rateOfFire/damage;

    public int getDamage() {
        return damage;
    }

    public int getRateOfFire() {
        return rateOfFire;
    }

    public int getMagazineSize() {
        return magazineSize;
    }

    public int getReloadTime() {
        return reloadTime;
    }

    public int getDamagePerSecond() {
        return damagePerSecond;
    }


}
