package Items;

public abstract class Item {

    public int itemID;
    public String itemName;

    public String getItemName() {
        return itemName;
    }

    public int getItemID() {
        return itemID;
    }

    protected enum RARITY_LEVEL{
        LEGENDARY, //Orange
        EPIC, //Purple
        RARE, //Blue
        UNCOMMON,//Green
        COMMON;//Grey
    }

    public RARITY_LEVEL itemRarity;

    public RARITY_LEVEL getItemRarity() { return itemRarity; }
}
