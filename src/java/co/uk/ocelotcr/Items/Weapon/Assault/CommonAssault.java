package co.uk.ocelotcr.Items.Weapon.Assault;

public class CommonAssault extends AssaultRifle {

    public CommonAssault(){
        super.setItemRarity(RARITY_LEVEL.COMMON);
        super.setItemName("Assault Rifle - Common");
        super.setDamage(30);
        super.setRateOfFire(5);
        super.setReloadTime(2);
        super.setDamagePerSecond(getDamage()*getRateOfFire());
    }
}
