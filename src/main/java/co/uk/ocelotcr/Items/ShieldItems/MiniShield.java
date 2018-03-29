package co.uk.ocelotcr.Items.ShieldItems;

import co.uk.ocelotcr.Items.Stackable;
import org.bukkit.Material;

public class MiniShield extends Shield implements Stackable{

    private int maxStackAmount;

    public MiniShield() {
        super.setConsumeSpeed(2);
        super.setItemRarity(RARITY_LEVEL.UNCOMMON);
        super.setItemName("Mini Shield");
        super.setMaterialObject(Material.POTION);
        super.setShieldValue(15);
        maxStackAmount = 10;
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
