package Items.HealthItems;

import Items.Stackable;

public class Bandage extends HealthItem implements Stackable {

    public Bandage(){
       super.healthValue = 15;
       super.consumeSpeed = 2;
       super.itemRarity = RARITY_LEVEL.COMMON;
       super.itemName = "Bandage";
       super.itemID = 339; // PAPER
    }

    @Override
    public boolean isStackable() {
        return false;
    }


    @Override
    public int getMaxStackAmount() {
        return 0;
    }
}
