package Items.HealthItems;

import Items.Stackable;
import org.bukkit.Material;

public class Bandage extends HealthItem implements Stackable {

    public Bandage(){
       super.healthValue = 15;
       super.consumeSpeed = 2;
       super.itemRarity = RARITY_LEVEL.COMMON;
       super.itemName = "Bandage";
       super.materialObject = Material.PAPER; // PAPER
    }

    @Override
    public boolean isStackable() {
        return true;
    }


    @Override
    public int getMaxStackAmount() {
        return 10;
    }
}
