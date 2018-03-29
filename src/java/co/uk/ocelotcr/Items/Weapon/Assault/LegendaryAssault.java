package co.uk.ocelotcr.Items.Weapon.Assault;

public class LegendaryAssault extends AssaultRifle {
    public LegendaryAssault() {
        super.setItemRarity(RARITY_LEVEL.LEGENDARY);
        super.setItemName("Assault Rifle - Legendary");
        super.setDamage(38);
        super.setRateOfFire(6);
        super.setReloadTime(1);
        super.setDamagePerSecond(getDamage()*getRateOfFire());
    }
}
