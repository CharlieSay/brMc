package co.uk.ocelotcr.Items.Weapon.Assault;

public class EpicAssault extends AssaultRifle {

    public EpicAssault() {
        super.setItemRarity(RARITY_LEVEL.EPIC);
        super.setItemName("Assault Rifle - Epic");
        super.setDamage(36);
        super.setRateOfFire(6);
        super.setReloadTime(2);
        super.setDamagePerSecond(getDamage()*getRateOfFire());
    }

}
