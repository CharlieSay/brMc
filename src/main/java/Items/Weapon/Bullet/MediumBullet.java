package Items.Weapon.Bullet;

import org.bukkit.Material;

/*
AR
 */

public class MediumBullet extends Bullet {

    public MediumBullet() {
        currentStackAmount = 0;
        super.materialObject = Material.ARROW;
        super.itemName = "Medium Bullets";
        super.itemRarity = RARITY_LEVEL.COMMON;
    }

    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int getMaxStackAmount() {
        return 999;
    }
}
