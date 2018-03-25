package Items.ShieldItems;

import org.bukkit.Material;

public class LargeShield extends Shield{

    private int maxStackAmount;

    public LargeShield() {
        super.shieldValue = 50;
        super.consumeSpeed = 5;
        super.itemRarity = RARITY_LEVEL.RARE;
        maxStackAmount = 3;
        super.itemName = "Large Shield";
        super.materialObject = Material.WATER_BUCKET;
    }

    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int getMaxStackAmount() {
        return maxStackAmount;
    }
}
