package Items.Weapon.Assault;

import Items.Weapon.Weapon;
import org.bukkit.Material;

public class CommonAssault extends Weapon {

    public CommonAssault(){
        super.itemRarity = RARITY_LEVEL.COMMON;
        super.materialObject = Material.BOW;
        super.itemName = "Assault Rifle";
        super.damage = 30;
        super.magazineSize = 30;
        super.rateOfFire = 1;
        super.reloadTime = 2;
    }
}
