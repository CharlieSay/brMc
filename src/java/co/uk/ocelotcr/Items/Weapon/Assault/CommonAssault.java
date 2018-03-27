package co.uk.ocelotcr.Items.Weapon.Assault;

import co.uk.ocelotcr.Items.Weapon.Weapon;
import org.bukkit.Material;

public class CommonAssault extends Weapon {

    public CommonAssault(){
        super.setItemRarity(RARITY_LEVEL.COMMON);
        super.setMaterialObject(Material.BOW);
        super.setItemName("Assault Rifle - Common");
        super.setDamage(30);
        super.setMagazineSize(30);
        super.setRateOfFire(1);
        super.setReloadTime(2);
        super.setDamagePerSecond(getDamage()/getRateOfFire());
    }
}
