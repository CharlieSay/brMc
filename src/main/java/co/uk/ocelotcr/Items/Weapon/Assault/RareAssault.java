package co.uk.ocelotcr.Items.Weapon.Assault;

public class RareAssault extends AssaultRifle {
    public RareAssault() {
        super.setItemRarity(RARITY_LEVEL.RARE);
        super.setItemName("Assault Rifle - Rare");
        super.setDamage(34);
        super.setRateOfFire(5);
        super.setReloadTime(2);
        super.setDamagePerSecond(getDamage()*getRateOfFire());
    }
}
