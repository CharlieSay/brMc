package co.uk.ocelotcr.Items.Weapon;

import co.uk.ocelotcr.Items.Item;

public abstract class Weapon extends Item {

    private int damage;
    private int rateOfFire;
    private int magazineSize;
    private int reloadTime;
    private int damagePerSecond;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRateOfFire(int rateOfFire) {
        this.rateOfFire = rateOfFire;
    }

    public void setMagazineSize(int magazineSize) {
        this.magazineSize = magazineSize;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    public void setDamagePerSecond(int damagePerSecond) { this.damagePerSecond = damagePerSecond; }

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
