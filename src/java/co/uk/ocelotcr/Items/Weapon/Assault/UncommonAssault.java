package co.uk.ocelotcr.Items.Weapon.Assault;

import co.uk.ocelotcr.Items.Weapon.Weapon;
import org.bukkit.Material;

public class UncommonAssault extends Weapon {

    public UncommonAssault(){
        super.setItemRarity(RARITY_LEVEL.UNCOMMON);
        super.setMaterialObject(Material.BOW);
        super.setItemName("Assault Rifle - Uncommon");
        super.setDamage(32);
        super.setMagazineSize(30);
        super.setRateOfFire(5);
        super.setReloadTime(2);
        super.setDamagePerSecond(getDamage()*getRateOfFire());
    }

}
