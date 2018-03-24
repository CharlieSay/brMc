package Items.ShieldItems;

import Items.Stackable;

public class MiniShield extends Shield implements Stackable{

    private int maxStackAmount;

    public MiniShield() {
        super.shieldValue = 25;
        super.consumeSpeed = 2;
        super.itemRarity = RARITY_LEVEL.UNCOMMON;
        maxStackAmount = 10;
        super.itemName = "Mini ShieldItems";
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
