package Items.Weapon.Bullet;

import org.bukkit.Material;

public class HeavyBullet extends Bullet{

    public HeavyBullet() {
        currentStackAmount = 0;
        super.materialObject = Material.ARROW;
        super.itemName = "Heavy Bullets";
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
