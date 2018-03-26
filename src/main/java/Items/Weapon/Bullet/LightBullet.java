package Items.Weapon.Bullet;

import org.bukkit.Material;

public class LightBullet extends Bullet {

    public LightBullet() {
        currentStackAmount = 0;
        super.materialObject = Material.ARROW;
        super.itemName = "Light Bullets";
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
