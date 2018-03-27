package co.uk.ocelotcr.Items.HealthItems;

import co.uk.ocelotcr.Items.Stackable;
import org.bukkit.Material;

public class MedicalKit extends HealthItem implements Stackable {

    public MedicalKit(){
        super.setConsumeSpeed(10);
        super.setItemRarity(RARITY_LEVEL.UNCOMMON);
        super.setItemName("Med Kit");
        super.setMaterialObject(Material.SLIME_BLOCK);
        super.setHealthValue(100);
    }

    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int getMaxStackAmount() {
        return 3;
    }
}
