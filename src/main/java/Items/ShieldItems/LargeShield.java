package Items.ShieldItems;

import org.bukkit.Material;

public class LargeShield extends Shield{

    private int maxStackAmount;

    public LargeShield() {
        super.setConsumeSpeed(5);
        super.setItemRarity(RARITY_LEVEL.RARE);
        super.setItemName("Huge Shield");
        super.setMaterialObject(Material.WATER_BUCKET);
        super.setShieldValue(50);
        maxStackAmount = 3;
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
