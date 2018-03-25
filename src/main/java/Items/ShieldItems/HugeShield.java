package Items.ShieldItems;

import org.bukkit.Material;

public class HugeShield extends Shield{

    public HugeShield() {
        super.shieldValue = 100;
        super.consumeSpeed = 15;
        super.itemRarity = RARITY_LEVEL.LEGENDARY;
        super.itemName = "Huge Shield";
        super.materialObject = Material.LAVA_BUCKET;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getMaxStackAmount() {
        return 1;
    }
}
