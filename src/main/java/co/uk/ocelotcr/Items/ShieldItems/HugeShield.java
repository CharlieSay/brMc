package co.uk.ocelotcr.Items.ShieldItems;

import co.uk.ocelotcr.Items.Item;
import org.bukkit.Material;

public class HugeShield extends Shield{

    public HugeShield() {
        super.setConsumeSpeed(15);
        super.setItemRarity(Item.RARITY_LEVEL.LEGENDARY);
        super.setItemName("Huge Shield");
        super.setMaterialObject(Material.LAVA_BUCKET);
        super.setShieldValue(100);
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
