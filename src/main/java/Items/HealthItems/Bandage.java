package Items.HealthItems;

import Items.Stackable;
import org.bukkit.Material;

public class Bandage extends HealthItem implements Stackable {

    public Bandage(){
        super.setConsumeSpeed(2);
        super.setItemRarity(RARITY_LEVEL.COMMON);
        super.setItemName("Bandage");
        super.setMaterialObject(Material.PAPER);
        super.setHealthValue(15);
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
