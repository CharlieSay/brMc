package co.uk.ocelotcr.Items.Weapon.Assault;

public class UncommonAssault extends AssaultRifle {

    public UncommonAssault(){
        super.setItemRarity(RARITY_LEVEL.UNCOMMON);
        super.setItemName("Assault Rifle - Uncommon");
        super.setDamage(32);
        super.setRateOfFire(5);
        super.setReloadTime(2);
        super.setDamagePerSecond(getDamage()*getRateOfFire());
    }

}
