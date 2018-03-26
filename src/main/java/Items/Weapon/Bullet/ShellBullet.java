package Items.Weapon.Bullet;

import org.bukkit.Material;

public class ShellBullet extends Bullet{

    public ShellBullet() {
        currentStackAmount = 0;
        super.materialObject = Material.ARROW;
        super.itemName = "Shells";
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
