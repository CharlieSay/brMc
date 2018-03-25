package Items.HealthItems;

import Items.Consumeable;
import Items.Stackable;
import org.bukkit.Material;

public class MedicalKit extends HealthItem implements Stackable {

    public MedicalKit(){
        super.healthValue = 100;
        super.consumeSpeed = 10;
        super.itemRarity = RARITY_LEVEL.UNCOMMON;
        super.itemName = "Med Kit";
        super.materialObject = Material.SLIME_BLOCK; //Slime Block
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
